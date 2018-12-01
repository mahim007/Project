package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;
import com.example.demo.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@Controller
public class myController {
    @Autowired
    MyService service;

    @GetMapping("/welcome")
    public String getMessage(){
        PdfGen pdfGen=new PdfGen();
        pdfGen.m1();
        return "showPdf";
    }

    @PostMapping("/addStudent")
    public ModelAndView addStudent(Student student){
        service.addStudent(student);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("registration");
        return mv;
    }

    @GetMapping("/getStudent")
    public ModelAndView getStudent(@RequestParam("id") int id){
        ModelAndView mv=new ModelAndView("index");
        Student student=service.getStudent(id);
        mv.addObject(student);
        return mv;
    }

//    @RequestMapping("/getUpdateStudent")
//    public ModelAndView updateStudent(@RequestParam("id") int id){
//        ModelAndView mv=new ModelAndView("updateInfo");
//        Student student=service.getStudent(id);
//        mv.addObject(student);
//        return mv;
//    }

    @RequestMapping("/updateStudent")
    public ModelAndView updateStudent(Student student){
        service.updateStudent(student);
        ModelAndView mv=new ModelAndView("registration");
        return mv;
    }

    @RequestMapping("/deleteStudent")
    public ModelAndView deleteStudent(@RequestParam("id") int id){
        service.deleteStudent(id);
        ModelAndView mv=new ModelAndView("registration");
        return mv;
    }
}
