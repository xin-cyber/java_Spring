package com.transaction;

import com.transaction.config.SpringConfig;
import com.transaction.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author JX
 * @ClassName: com.transaction.TestConfig
 * @Create 2023-09-09 21:51
 * @Description: TODO
 */
public class TestConfig {
    @Test
    public void testTxAllAnnotation() {
        // 创建Spring容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController accountService = applicationContext.getBean("bookController", BookController.class);
        accountService.buyBook(1, 1);
    }
}
