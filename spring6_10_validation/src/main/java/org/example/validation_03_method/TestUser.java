package org.example.validation_03_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author JX
 * @ClassName: org.example.validation_03_method.TestUser
 * @Create 2023-09-10 17:47
 * @Description: TODO
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService service = context.getBean(MyService.class);
        User user = new User();
        user.setName("lucy");
        user.setPhone("13566754321");
        user.setMessage("test a t");
        service.testMethod(user);
    }
}
