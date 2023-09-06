package org.example.service.impl;

import org.example.annotation.Bean;
import org.example.annotation.Di;
import org.example.dao.UserDao;
import org.example.service.UserService;

/**
 * @Author JX
 * @ClassName: org.example.impl.UserServiceImpl
 * @Create 2023-09-05 21:44
 * @Description: TODO
 */
@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    public void add() {
        System.out.println("service.....");
    }
}
