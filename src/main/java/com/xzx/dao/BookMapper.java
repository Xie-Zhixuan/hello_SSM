package com.xzx.dao;

import com.xzx.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {

    //增加一个Book
    int addBook(Book book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Book books);

    //根据id查询,返回一个Book
    Book queryBookById(int id);


    List<Book> queryBookByName(@Param("bName") String bookName);

    //查询全部Book,返回list集合
    List<Book> queryAllBook();

    @Select("SELECT * from ssmbuild.books")
    Book queryAllBook_();
}
