package org.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author JX
 * @ClassName: org.example.TestUser
 * @Create 2023-08-31 21:47
 * @Description: TODO
 */
public class TestUser {

    // 创建Logger对象
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void test() {
        // 获取Spring 框架的核心容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建的对象,强转成user类 (根据id获取)
        User user = (User) context.getBean("user");

        // 根据类型获取
        User user2 = context.getBean(User.class);
        System.out.println("根据类型获取" + user2);

        user.add();

        // 手动写入日志
        logger.info("执行调用....");
    }

    @Test
    public void testUser1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取class对象
        Class clazz = Class.forName("org.example.User");
        // 调用方法创建对象
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
