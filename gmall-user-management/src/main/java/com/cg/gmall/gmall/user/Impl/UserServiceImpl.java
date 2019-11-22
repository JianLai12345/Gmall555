package com.cg.gmall.gmall.user.Impl;

import com.cg.gmall.bean.UserInfo;
import com.cg.gmall.gmall.user.mapper.UserInfoMapper;
import com.cg.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        List<UserInfo> userInfoList = userInfoMapper.selectAll();
        return  userInfoList;
    }
}
