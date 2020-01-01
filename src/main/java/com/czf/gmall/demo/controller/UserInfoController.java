package com.czf.gmall.demo.controller;

import com.czf.gmall.demo.bean.UserInfo;
import com.czf.gmall.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/findAll")
    @ResponseBody
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

}
