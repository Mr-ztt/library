package com.group.service;

import com.group.entity.User;

import java.util.List;

public interface IUserService {
    public List<User> queryUserList(Integer page, Integer size);
}
