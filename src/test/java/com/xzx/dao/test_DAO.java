package com.xzx.dao;

import com.xzx.pojo.Book;
import com.xzx.service.BookService;
import com.xzx.util.Util_Mybatis;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test_DAO {
    @Test
    public void test_q(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookMapper bookMapper = applicationContext.getBean("bookMapper",BookMapper.class);
        List<Book> books = bookMapper.queryBookByName("a");
        books.forEach(System.out::println);
    }
}
