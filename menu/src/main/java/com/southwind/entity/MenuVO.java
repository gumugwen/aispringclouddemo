package com.southwind.entity;

import lombok.Data;

import java.util.List;

@Data
public class MenuVO {

    public MenuVO() {
    }

    private int code;
    private String msg;
    private int count;
    private List<Menu> data;

    public void setCode(int code) {
        this.code = code;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public void setData(List<Menu> data) {
        this.data = data;
    }
    public MenuVO(int code, String msg, int count, List<Menu> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }
}
