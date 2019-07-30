package com.group.service.imple;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.group.dao.UserDao;
import com.group.entity.User;
import com.group.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryUserList(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        return userDao.querylist();
    }

    public int addUser(User user) {
        return 1;
    }
}
