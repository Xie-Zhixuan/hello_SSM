package com.xzx.controller;

import com.xzx.pojo.Course;
import com.xzx.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    @Qualifier("courseService")
    CourseService courseService;

    @RequestMapping("/allCourse")
    public String showAllCourses(Model model){

        List<Course> allCourse = courseService.findAll();
        model.addAttribute("list",allCourse);
        return "allCourse";
    }


    @RequestMapping("/del/{ID}")
    public String delCourse(@PathVariable int ID){
        System.out.println("收到对 "+ID+" 的删除请求");
        boolean delete = courseService.delete(ID);
        if(delete) System.out.println("del done!");
        else System.out.println("del fault");

        return "redirect:/course/allCourse";
    }

    @RequestMapping("/toUpdateCourse/{ID}")
    public String toUpdateCourseJSP(@PathVariable int ID,Model model){
        Course course = courseService.findByID(ID);
        model.addAttribute("course",course);
        return "updateCourse";
    }

    @RequestMapping("/updateCourse")
    public String updateCourse(Course course){
        System.out.println(course);
        boolean update = courseService.update(course);
        if(update) System.out.println("update done!");
        else System.out.println("update fault");

        return "redirect:/course/allCourse";
    }

    @RequestMapping("/toAddCourse")
    public String toAddCourseJSP(){
        return "addCourse";
    }

    @RequestMapping("/addCourse")
    public String addCourse(Course course){
        boolean insert = courseService.insert(course);
        if (insert) System.out.println("insert done!");
        else System.out.println("insert fault");

        return "redirect:/course/allCourse";
    }

    @RequestMapping("/search")
    public String searchCourse_obscure(String Name,Model model){
        System.out.println("收到关于 "+Name+" 的查询请求");
        List<Course> courses = courseService.findByName_obscure(Name);
        model.addAttribute("list",courses);
        return "allCourse";
    }
//    @RequestMapping("/search/{Name}")
//    public String searchCourse_obscure(@PathVariable String Name,Model model){
//        System.out.println("收到关于 "+Name+" 的查询请求");
//        List<Course> courses = courseService.findByName_obscure(Name);
//        model.addAttribute("list",courses);
//        return "allCourse";
//    }

}
