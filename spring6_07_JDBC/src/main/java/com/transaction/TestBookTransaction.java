package com.transaction;

import com.transaction.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author JX
 * @ClassName: com.transaction.TestBookTransaction
 * @Create 2023-09-08 15:52
 * @Description: TODO
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class TestBookTransaction {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        bookController.buyBook(1, 1);
//        Integer[] bookIds = {1,2};
//        bookController.checkout(bookIds,1);
    }
}
