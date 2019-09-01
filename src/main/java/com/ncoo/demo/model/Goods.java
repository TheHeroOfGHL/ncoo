package com.ncoo.demo.model;

import com.ncoo.demo.enums.GoodsEnum;

/**
 * @Description:
 * @Author: gaohl
 * @CreateDate: 2019/8/29 18:24
 */
public class Goods {
    private int id;

    private String name;

    private String price;

    private GoodsEnum type;

    private String typeValue;

    private int popular;

    private int recommend;

    public int getPopular() {
        return popular;
    }

    public void setPopular(int popular) {
        this.popular = popular;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

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
        return type.getValue();
    }

    public void setType(GoodsEnum goodsEnum) {

        this.type = goodsEnum;
    }

    public int getRecommend() {
        return recommend;
    }
}
