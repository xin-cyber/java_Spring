package org.example.ResourceDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author JX
 * @ClassName: org.example.ResourceDI.TestBean
 * @Create 2023-09-09 23:10
 * @Description: TODO
 */
public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        ResourceBean resourceBean = context.getBean(ResourceBean.class);
        resourceBean.parse();
    }
}
