package com.transaction.controller;

import com.transaction.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author JX
 * @ClassName: com.transaction.controller.BookController
 * @Create 2023-09-08 14:10
 * @Description: TODO
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //买书的方法：图书id和用户id
    public void buyBook(Integer bookId, Integer userId) {
        //调用service方法
        bookService.buyBook(bookId, userId);
    }
}
