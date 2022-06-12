package com.cm.health.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author chenmo
 */
@Configuration
@MapperScan(basePackages = "com.cm.health.repository")
public class MyBatisConfig {


    @ConfigurationProperties("spring.datasource")
    @Primary
    @Bean(name = "dataSource")
    public DataSource dataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        try {
            sqlSessionFactoryBean.setDataSource(dataSource);
            // 设置别名包（实体类）
            sqlSessionFactoryBean.setTypeAliasesPackage("com.cm.health.model.entity.*");
            // 设置mybatis的主配置文件
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            // 设置sql配置文件路径
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mapping/*.xml"));
            // 加载mybatis的全局配置文件
            Resource mybatisConfigXml = resolver.getResource("classpath:mybatis/mybatis-config.xml");
            sqlSessionFactoryBean.setConfigLocation(mybatisConfigXml);

            return sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
