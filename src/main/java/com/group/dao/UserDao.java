package com.group.dao;


import com.group.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    /*
        定义访问数据层接口
     */
    public int add();
    public List<User> querylist();
    public int addUser(User user);
}
