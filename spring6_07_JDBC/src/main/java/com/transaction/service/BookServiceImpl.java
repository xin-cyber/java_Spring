package com.transaction.service;

import com.transaction.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author JX
 * @ClassName: com.transaction.service.BookServiceImpl
 * @Create 2023-09-08 14:11
 * @Description: TODO
 */
@Transactional // 事务注解，保证原子性
// readOnly = true  明确告诉数据库，这个操作不涉及写操作。这样数据库就能够针对查询操作来进行优化。
// timeout = 3  超时回滚，释放资源, 秒
// 回滚策略：哪些异常事务不回滚
//@Transactional(noRollbackFor = ArithmeticException.class) 设置一个Class类型的对象
//@Transactional(noRollbackForClassName = "java.lang.ArithmeticException") 设置一个字符串类型的全类名
// 隔离级别
//@Transactional(isolation = Isolation.DEFAULT)//使用数据库默认的隔离级别
//@Transactional(isolation = Isolation.READ_UNCOMMITTED)//读未提交
//@Transactional(isolation = Isolation.READ_COMMITTED)//读已提交
//@Transactional(isolation = Isolation.REPEATABLE_READ)//可重复读
//@Transactional(isolation = Isolation.SERIALIZABLE)//串行化
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void buyBook(Integer bookId, Integer userId) {
        //根据图书id查询图书价格
        Integer price = bookDao.getBookPriceByBookId(bookId);

        //更新图书表库存量 -1
        bookDao.updateStock(bookId);

        //更新用户表用户余额 -图书价格
        bookDao.updateUserBalance(userId, price);

        // System.out.println(1/0);
    }
}
