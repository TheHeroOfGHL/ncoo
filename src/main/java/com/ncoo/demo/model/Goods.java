package com.ncoo.demo.model;

/**
 * @Description:
 * @Author: gaohl
 * @CreateDate: 2019/8/29 18:24
 */
public class Goods {
    private int id;

    private String name;

    private String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
}
