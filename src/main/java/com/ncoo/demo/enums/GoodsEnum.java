package com.ncoo.demo.enums;

/**
 * @Description:
 * @Author: gaohl
 * @CreateDate: 2019/8/31 21:35
 */
public enum GoodsEnum {
    STAPLE_FOOD ("0","主食"),
    COLD_DISH ("1","凉菜"),
    HOT_DISH ("2","热菜"),
    SOUP ("3","汤"),
    DRINK ("4","酒水"),
    DESSERT ("5","甜品"),
    FRYING ("6","油炸"),
    LU_WEI ("7","卤味");

    public String code;
    public String value;

    private GoodsEnum(String code,String value){
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
