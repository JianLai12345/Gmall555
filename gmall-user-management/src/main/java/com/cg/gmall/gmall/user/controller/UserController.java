package com.cg.gmall.gmall.user.controller;

import com.cg.gmall.bean.UserInfo;
import com.cg.gmall.gmall.user.Impl.UserServiceImpl;
import com.cg.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll")
    public List<UserInfo> getAll(){

        List<UserInfo> list = userService.findAll();

        return list;

    }

}
