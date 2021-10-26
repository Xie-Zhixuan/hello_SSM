package com.xzx.dao;


import com.xzx.pojo.Book;
import com.xzx.service.BookService;
import com.xzx.util.Util_Mybatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class test_mybatis {
    @Test
    public void testXml() throws IOException {
        SqlSession session = Util_Mybatis.getSqlSession();
        BookMapper mapper = session.getMapper(BookMapper.class);
        List<Book> books = mapper.queryAllBook();
        books.forEach(System.out::println);
        session.close();

    }

    @Test
    public void testBean() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        List<Book> books = bookService.queryAllBook();
        books.forEach(System.out::println);
    }

    @Test
    public void testBean_() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = applicationContext.getBean("bookService1", BookService.class);
        List<Book> books = bookService.queryAllBook();
        books.forEach(System.out::println);
    }
    @Test
    public void testBean_M() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = applicationContext.getBean("bookServiceM", BookService.class);
        List<Book> books = bookService.queryAllBook();
        books.forEach(System.out::println);
    }

    @Test
    public void getAll(){
        BookMapper mapper = Util_Mybatis.getSqlSession().getMapper(BookMapper.class);
        List<Book> books = mapper.queryAllBook();
        books.forEach(System.out::println);
    }

    @Test
    public void getOneforList(){
        BookMapper mapper = Util_Mybatis.getSqlSession().getMapper(BookMapper.class);
        Book book = mapper.queryAllBook_();
        System.out.println(book);
    }

}
