package com.ncoo.demo.service;

import com.ncoo.demo.dao.GoodsDAO;
import com.ncoo.demo.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description:
 * @Author: gaohl
 * @CreateDate: 2019/8/31 14:22
 */
public class GoodsService {

    @Autowired
    private GoodsDAO goodsDAO;

    public int insertUser(Goods goods){
        return goodsDAO.insertGoods(goods);
    }

    public Goods selectByRecommend(int recommend){
        return goodsDAO.selectByRecommend(recommend);
    }

    public List<Goods> selectAll(){
        return goodsDAO.selectAll();
    }
}
