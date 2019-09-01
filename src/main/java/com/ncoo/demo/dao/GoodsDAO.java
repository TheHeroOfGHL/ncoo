package com.ncoo.demo.dao;

import com.ncoo.demo.model.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @Description:
 * @Author: gaohl
 * @CreateDate: 2019/8/31 14:21
 */
public interface GoodsDAO {

    @Insert({"insert into goods(name,price,type,popular,recommend) values(#{name},#{price},#{type},#{popular},#{recommend})"})
    public int insertGoods(Goods goods);

    @Select({"select * from goods where recommend = #{recommend}"})
    Goods selectByRecommend(int recommend);
    @Select({"select * from goods"})
    Goods selectAll();
}
