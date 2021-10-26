package com.xzx.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xzx.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @RequestMapping(value="/t1",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String test_json(Model model){

        Student xzx = new Student(19321124, "谢志炫");
        String str = xzx.toString();

        System.out.println(str);

        return str;
    }


    @RequestMapping(value="/t2",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String test_fastjson(Model model){


        Student xzx = new Student(19321124, "谢志炫");

//        java对象->JSON字符串
        String str = JSON.toJSONString(xzx);
        System.out.println(str);

//        JSON字符串->java对象
        Student stu = JSON.parseObject(str,Student.class);
        System.out.println(stu);

//        JAVA对象->JSON对象
        JSONObject jsonObject =(JSONObject) JSON.toJSON(xzx);
        System.out.println(jsonObject);

//        JSON对象->Java对象
        Student student = JSON.toJavaObject(jsonObject, Student.class);
        System.out.println(student);

        return str;
    }

   @RequestMapping(value="/t3",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String test_jackjson(Model model) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        Student xzx = new Student(19321124, "谢志炫");

        String str = objectMapper.writeValueAsString(xzx);

//        System.out.println(str);
        return str;
    }

    @RequestMapping("/tl")
    @ResponseBody
    public String test_list(Model model) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        Student xzx = new Student(19321124, "谢志炫");
        Student xzx1 = new Student(193211241, "谢志炫1");
        Student xzx2 = new Student(193211242, "谢志炫2");
        Student xzx3 = new Student(193211243, "谢志炫3");

        List list=new ArrayList<Student>();
        list.add(xzx);
        list.add(xzx1);
        list.add(xzx2);
        list.add(xzx3);


        String str = objectMapper.writeValueAsString(list);

        System.out.println(str);
        return str;
    }

}
