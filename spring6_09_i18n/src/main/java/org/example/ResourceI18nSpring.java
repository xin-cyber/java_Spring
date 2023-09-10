package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * @Author JX
 * @ClassName: org.example.ResourceI18nSping
 * @Create 2023-09-10 16:34
 * @Description: TODO
 */
public class ResourceI18nSpring {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        Object[] objs = new Object[]{"atguigu", new Date().toString()}; // 动态传入0，1
        // key , values , 语言
        String value = context.getMessage("www.atguigu.com", objs, Locale.CHINA);
        System.out.println(value);
    }
}
