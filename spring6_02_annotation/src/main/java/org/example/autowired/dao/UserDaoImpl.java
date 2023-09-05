package org.example.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author JX
 * @ClassName: org.example.autowired.dao.UserDaoImpl
 * @Create 2023-09-04 21:06
 * @Description: TODO
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao.....");
    }
}
