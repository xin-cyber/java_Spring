package org.example.dao.impl;

import org.example.annotation.Bean;
import org.example.dao.UserDao;

/**
 * @Author JX
 * @ClassName: org.example.dao.impl.UserDaoImpl
 * @Create 2023-09-05 21:47
 * @Description: TODO
 */
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao.add......");
    }
}
