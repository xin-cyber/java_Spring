package org.example;

import org.example.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author JX
 * @ClassName: org.example.TestUserAnnotation
 * @Create 2023-09-05 19:53
 * @Description: TODO
 */
public class TestUserAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
