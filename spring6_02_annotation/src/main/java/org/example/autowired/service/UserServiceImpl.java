package org.example.autowired.service;

import org.example.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author JX
 * @ClassName: org.example.autowired.service.UserServiceImpl
 * @Create 2023-09-04 21:04
 * @Description: TODO
 */
@Service
public class UserServiceImpl implements UserService {


    // 注入service（属性注入）
    @Autowired  //根据类型找到对应的对象，完成注入
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service......");
        userDao.add();
    }

}
