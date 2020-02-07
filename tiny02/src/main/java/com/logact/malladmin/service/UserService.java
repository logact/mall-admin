package com.logact.malladmin.service;

import com.logact.malladmin.entity.SpUser;

/**
 * @author: logact
 * @date: Created in 2020/2/7 20:38
 * @description:
 */
public interface UserService {

    SpUser selectById(int id);

}
