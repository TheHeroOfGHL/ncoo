package com.ncoo.demo.dao;

import com.ncoo.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author weilong
 * @date 2019/8/30 23:29
 */
@Mapper
public interface UserDAO {

    @Select({"select * from user where tel=#{tel}"})
    User selectUserByTel(String tel);
}
