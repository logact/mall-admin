package com.logact.malladmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.logact.malladmin.dao.SpUserDao;
import com.logact.malladmin.entity.RectLogin;
import com.logact.malladmin.entity.SpUser;
import com.logact.malladmin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: logact
 * @date: Created in 2020/2/6 17:10
 * @description:
 */
@Service("LoginService")
public class LoginServiceImp implements LoginService {
    @Autowired
    SpUserDao spUserDao;
    @Override
    public RectLogin validateUser(String username, String password) {
        RectLogin rectLogin=new RectLogin();
        QueryWrapper<SpUser> wrapper=new QueryWrapper<>();
        wrapper.eq( "username", username);
        wrapper.eq("password",password);
        SpUser spUser=spUserDao.selectOne(wrapper);
        if(spUser==null){
            return null;
        }
        rectLogin.setUsername(spUser.getUsername());
        rectLogin.setId(spUser.getUserId());
        rectLogin.setEmail(spUser.getUserEmail());
        rectLogin.setMobile(spUser.getUserTel());
        rectLogin.setRid(31);//这里的角色统一为测试角色
        rectLogin.setToken("token place");
        return rectLogin;
    }

}
