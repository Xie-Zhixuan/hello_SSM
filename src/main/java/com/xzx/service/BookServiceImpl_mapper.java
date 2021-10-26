package com.xzx.service;

import com.xzx.dao.BookMapper;
import com.xzx.pojo.Book;

import java.util.List;

public class BookServiceImpl_mapper implements BookService {
    private final BookMapper bookMapper;

    public BookServiceImpl_mapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Book book) {
        return this.bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return this.bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Book books) {
        return this.bookMapper.updateBook(books);
    }

    @Override
    public Book queryBookById(int id) {
        return this.bookMapper.queryBookById(id);
    }

    @Override
    public List<Book> queryBookByName(String bookName) {
        return this.bookMapper.queryBookByName(bookName);
    }

    @Override
    public List<Book> queryAllBook() {
        return this.bookMapper.queryAllBook();
    }
}