package com.cg.gmall.service;

import com.cg.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 查询多有用户
     * @return
     */
    public List<UserInfo> findAll();
}
