package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;
import com.example.demo.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRestController {
    @Autowired
    MyService service;

    @GetMapping("/api/Students")
    public List<Student> getAllStudents(){
        return (List<Student>) service.getAllStudents();
    }

    @GetMapping("/api/Student/{id}")
    public Student getStudentById(@PathVariable("id") int id){
         Student student=service.getStudent(id);
         return student;
    }

    @PostMapping("/api/Students")
    public Student addStudent(@RequestBody Student student){
        service.addStudent(student);
        return student;
    }

    @PutMapping("/api/Student/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") int id){
        service.updateStudent(student);
        return student;
    }

    @DeleteMapping("/api/Student/{id}")
    public Student deleteStudent(@PathVariable("id") int id){
        Student student=service.getStudent(id);
        service.deleteStudent(id);
        return student;
    }
}
