package com.ncoo.demo.dao;

import com.ncoo.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author weilong
 * @date 2019/8/30 23:29
 */
@Mapper
public interface UserDAO {

    @Select({"select * from user where tel=#{tel}"})
    User selectUserByTel(String tel);

    @Insert({"insert into user(name,sex,tel,password) values(#{user.name},#{user.sex},#{user.tel},#{user.password})"})
    int insertUser(User user);

    @Update({"update user set type = #{type} where id = #{id}"})
    int updateType(int id, int type);
}
