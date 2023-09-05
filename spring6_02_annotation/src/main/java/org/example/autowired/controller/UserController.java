package org.example.autowired.controller;

import org.example.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author JX
 * @ClassName: org.example.autowired.controller.UserController
 * @Create 2023-09-04 21:02
 * @Description: TODO
 */
@Controller
public class UserController {

    // 注入service（属性注入）
    @Autowired  //根据类型找到对应的对象，完成注入
    private UserService userService;

    public void add() {
        System.out.println("controller....");
        userService.add();
    }
}
