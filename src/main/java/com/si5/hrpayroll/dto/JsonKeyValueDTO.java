package com.si5.hrpayroll.dto;

public class JsonKeyValueDTO {
    private String key;
    private String value ;

    public JsonKeyValueDTO() {

    }

    public JsonKeyValueDTO(String key, String value) {
        this.key = key ;
        this.value = value ;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}