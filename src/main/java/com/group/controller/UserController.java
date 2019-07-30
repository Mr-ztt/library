package com.group.controller;


import com.github.pagehelper.PageInfo;
import com.group.entity.User;
import com.group.service.imple.IUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserServiceImpl iUserService;

    @RequestMapping("user-list")
    public Map queryUserList(Model model, @RequestParam(value = "page",required = false,defaultValue="2")Integer page,
                             @RequestParam(value = "size",required = false,defaultValue="5")Integer size){
        List<User> userList = iUserService.queryUserList(page, size);
        PageInfo pageInfo = new PageInfo(userList);
        List<User> list = pageInfo.getList();
        Map map = new HashMap<>();
        map.put("msg","用户列表");
        map.put("size", list.size());
        map.put("data",list);
        return map;
    }

    @RequestMapping("user-add")
    @ResponseBody
    public Map addUser(User user){
        //Date date = new Date();
        //SimpleDateFormat Time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int flag = iUserService.addUser(user);
        Map map = new HashMap();
        if (flag == 1){
            map.put("msg","success");
            map.put("data",flag);
            return  map;
        }
        map.put("msg","error");
        map.put("data",flag);
        return map;
    }

}
