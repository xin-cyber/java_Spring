package org.example.autowired;

import org.example.autowired.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author JX
 * @ClassName: org.example.autowired.TestUserController
 * @Create 2023-09-04 21:17
 * @Description: TODO
 */
public class TestUserController {

    public static void main(String[] args) {
        // 创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        UserController controller = context.getBean(UserController.class);
        controller.add();

    }
}
