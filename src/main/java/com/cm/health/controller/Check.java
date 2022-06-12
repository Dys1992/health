package com.cm.health.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@RestController
public class Check {

    @GetMapping
    public String checkHealth() {
        return "OK";
    }
}
