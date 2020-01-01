package com.czf.gmall.demo.service.impl;

import com.czf.gmall.demo.bean.UserInfo;
import com.czf.gmall.demo.mapper.UserInfoMapper;
import com.czf.gmall.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
