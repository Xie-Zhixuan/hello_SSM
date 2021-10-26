package com.xzx.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xzx.pojo.Book;
import com.xzx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceM")
    BookService bookService;

    @RequestMapping("/allBook")
    public String showAllBooks(Model model){
        List<Book> books = bookService.queryAllBook();
        model.addAttribute("list",books);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddJSP(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book){
        System.out.println(book);
        bookService.addBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/del/{bookID}")
public String delBook(@PathVariable int bookID){
        System.out.println("bookID= "+bookID);
        int i = bookService.deleteBookById(bookID);
        if(i>0) System.out.println("删除成功!");
        else System.out.println("删除失败");
        return "redirect:/book/allBook";
}

    @RequestMapping("toUpdateBook")
    public String toUpdateJSP(@RequestParam("id") int BookID, Model model){
        Book book = bookService.queryBookById(BookID);
        model.addAttribute("book",book);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Book book){
        int i = bookService.updateBook(book);
        if(i>0) System.out.println("更新成功!");
        else System.out.println("更新失败");
        return "redirect:/book/allBook";
    }

    @RequestMapping("/search")
    public String searchBook(String BookName, Model model){
        System.out.println("用户希望搜索的书籍: "+BookName);
        List<Book> books = bookService.queryBookByName(BookName);
        model.addAttribute("list",books);
        return "allBook";
    }


}
