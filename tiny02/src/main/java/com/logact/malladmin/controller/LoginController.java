package com.logact.malladmin.controller;

import com.logact.malladmin.entity.U2p;
import com.logact.malladmin.service.LoginService;
import com.logact.malladmin.unit.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: logact
 * @date: Created in 2020/2/6 15:00
 * @description:
 */
@RestController
@RequestMapping("login")
public class LoginController  {
    @Autowired
    LoginService loginService;
    @PostMapping
    public R Login(@RequestBody U2p u2p) {
        return  R.ok(loginService.validateUser(u2p.getUsername(), u2p.getPassword()), "验证失败", "验证成功");
    }
}
