package com.itheima.Service;

import com.itheima.dao.UserDao;

public class UserService {
    private static UserDao userDao = new UserDao();

    public UserService() {
    }

    //向dao层发送请求，传入用户输入数据
    public boolean exists(String name, String password) {
        return userDao.login(name,password)!=null;

    }
}
