package com.logact.malladmin.service.impl;

import com.logact.malladmin.dao.SpUserDao;
import com.logact.malladmin.entity.SpUser;
import com.logact.malladmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: logact
 * @date: Created in 2020/2/7 20:41
 * @description:
 */
@Service("UserService")
public class UserServiceImp
        implements UserService {
    @Autowired
    SpUserDao spUserDao;
    @Override
    public SpUser selectById(int id) {
        SpUser spUser=spUserDao.selectById(id);
        return spUser;
    }
}
