package com.ncoo.demo.service;

import com.ncoo.demo.dao.UserDAO;

import com.ncoo.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weilong
 * @date 2019/8/30 23:21
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public User selectUserByTel(String tel) {
        return userDAO.selectUserByTel(tel);
    }

    public boolean isTrueUser(String tel, String password) {
        User user = selectUserByTel(tel);
        if (user == null) return false;
        if (user.getPassword().equals(password)) return true;
        return false;
    }

    public boolean isBoss(User user) {
        if (user.getType() == 1) {
            return true;
        } else return false;
    }

    public int insertUser(User user) {
        return userDAO.insertUser(user);
    }

    public int updateType(int id, int type) {
        return userDAO.updateType(id, type);
    }

    public boolean isTelExist(String tel) {
        User user = userDAO.selectUserByTel(tel);
        if (user != null)
            return true;
        return false;
    }
}
