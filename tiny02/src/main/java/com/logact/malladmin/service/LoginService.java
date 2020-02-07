package com.logact.malladmin.service;

import com.logact.malladmin.entity.RectLogin;

/**
 * @author: logact
 * @date: Created in 2020/2/6 15:04
 * @description:
 */
public interface LoginService {
    public RectLogin validateUser(String username, String password);
}
