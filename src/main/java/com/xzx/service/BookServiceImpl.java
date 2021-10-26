package com.xzx.service;

import com.xzx.dao.BookMapper;
import com.xzx.pojo.Book;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BookServiceImpl implements BookService{
    private final SqlSession sqlSession;

    public BookServiceImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public int addBook(Book book) {
        return sqlSession.getMapper(BookMapper.class).addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return sqlSession.getMapper(BookMapper.class).deleteBookById(id);
    }

    @Override
    public List<Book> queryBookByName(String bookName) {
        return null;
    }

    @Override
    public int updateBook(Book books) {
        return sqlSession.getMapper(BookMapper.class).updateBook(books);
    }

    @Override
    public Book queryBookById(int id) {
        return sqlSession.getMapper(BookMapper.class).queryBookById(id);
    }

    @Override
    public List<Book> queryAllBook() {
        return sqlSession.getMapper(BookMapper.class).queryAllBook();
    }
}
