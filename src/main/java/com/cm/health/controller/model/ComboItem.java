package com.cm.health.controller.model;

/**
 * Created on 2021-05-26.
 * 下拉框option数据结构
 * @author yanle
 */
public class ComboItem {
    /** id */
    private String            id;

    /** 发布状态 */
    private String            publishStatus;

    /** 文本 */
    private String            text;

    /** 值 */
    private Object            value;

    private boolean           disabled;

    /**
     * Instantiates a new Combo item.
     */
    public ComboItem() {
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getId() {
        return id;
    }

    public ComboItem setId(String id) {
        this.id = id;
        return this;
    }

    public String getPublishStatus() {
        return publishStatus;
    }

    public ComboItem setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }

    /**
     * Instantiates a new Combo item.
     *
     * @param value the value
     * @param text  the text
     */
    public ComboItem(Object value, String text) {
        this.text = text;
        this.value = value;
    }

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(Object value) {
        this.value = value;
    }
}
