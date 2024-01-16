package com.tx_annotation.service;

import com.tx_annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Repository
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional(
//            readOnly = true
//            timeout = 1
            propagation = Propagation.REQUIRED
    )
        public void buyBook(Integer userId, Integer bookId) {
/*        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Integer price = bookDao.getPriceByBookId(bookId);
        bookDao.updateStock(bookId);
        bookDao.updateBalance(userId, price);
        System.out.println("success");
    }
}
