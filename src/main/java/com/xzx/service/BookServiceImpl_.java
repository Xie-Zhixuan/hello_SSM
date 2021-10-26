package com.xzx.service;

import com.xzx.dao.BookMapper;
import com.xzx.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


public class BookServiceImpl_ extends SqlSessionDaoSupport implements BookService{
//    private final SqlSession sqlSession;
//
//    public BookServiceImpl(SqlSession sqlSession) {
//        this.sqlSession = sqlSession;
//    }


    @Override
    public List<Book> queryBookByName(String bookName) {
        return null;
    }

    @Override
    public int addBook(Book book) {
        return getSqlSession().getMapper(BookMapper.class).addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return getSqlSession().getMapper(BookMapper.class).deleteBookById(id);
    }

    @Override
    public int updateBook(Book books) {
        return getSqlSession().getMapper(BookMapper.class).updateBook(books);
    }

    @Override
    public Book queryBookById(int id) {
        return getSqlSession().getMapper(BookMapper.class).queryBookById(id);
    }

    @Override
    public List<Book> queryAllBook() {
        return getSqlSession().getMapper(BookMapper.class).queryAllBook();
    }
}
