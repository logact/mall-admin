package com.logact.malladmin.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

/**
 * @author: logact
 * @date: Created in 2020/2/7 20:52
 * @description:
 */
public class CommonUtil {
    public static boolean isInt(String s){
        try {
            int i = Integer.valueOf(s);
            return true;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }


    }
    public  static  String getToken(String id,String password ) {
        String token="";
        token= JWT.create().withAudience(id)
                .sign(Algorithm.HMAC256(password));
        return token;
    }
}
