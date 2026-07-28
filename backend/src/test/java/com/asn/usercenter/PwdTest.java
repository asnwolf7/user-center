package com.asn.usercenter;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;

public class PwdTest extends TestCase {

    private static final String SALT = "yupi";

    @Test
    public void testGenPwd(){
        String userPassword = "12345678";
        String encryptPassword =DigestUtils.md5DigestAsHex((SALT + userPassword).getBytes());
        System.out.printf("pwd:[%s], encrypt pwd:[%s] \n", userPassword, encryptPassword);
    }
}
