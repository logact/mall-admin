package com.logact.malladmin;

import com.logact.malladmin.entity.SpUser;
import com.logact.malladmin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallAdminApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    UserService userService;
    @Test
    public void testUserDao(){
        SpUser spUser = userService.selectById(1);
        System.out.println("fdssssssssssssssssssssssssssssssssssssfddddddddddddddddfd");
        System.out.println("fdssssssssssssssssssssssssssssssssssssfddddddddddddddddfd");
        System.out.println("fdssssssssssssssssssssssssssssssssssssfddddddddddddddddfd");
        System.out.println("fdssssssssssssssssssssssssssssssssssssfddddddddddddddddfd");
        System.out.println("fdssssssssssssssssssssssssssssssssssssfddddddddddddddddfd");
        System.out.println("fdssssssssssssssssssssssssssssssssssssfddddddddddddddddfd");
        System.out.println("fdssssssssssssssssssssssssssssssssssssfddddddddddddddddfd");
        System.out.println(spUser.getUserEmail());
        System.out.println(spUser.getUserId());
        System.out.println(spUser.getUsername());


    }

}
