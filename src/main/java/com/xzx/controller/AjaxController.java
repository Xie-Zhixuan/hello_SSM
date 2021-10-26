package com.xzx.controller;

import com.xzx.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/ajax")
public class AjaxController {

    @RequestMapping("/t1")
    public boolean onblur(String name, HttpServletResponse resp) throws IOException {
        System.out.println(name);
//        if(name.equals("VIP")) resp.getWriter().println(true);
//        else resp.getWriter().println(false);
        if(name.equals("VIP")) return true;
        else return false;
    }

}
