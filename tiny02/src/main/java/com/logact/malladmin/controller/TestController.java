package com.logact.malladmin.controller;

import com.logact.malladmin.entity.SpUser;
import com.logact.malladmin.service.UserService;
import com.logact.malladmin.util.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: logact
 * @date: Created in 2020/2/7 21:12
 * @description:
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    UserService userService;
    @UserLoginToken
    @GetMapping
    public SpUser getAUser(int id){
        SpUser spUser = userService.selectById(id);

        return spUser;
    }

}
