package com.example.demo.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyService {
    @Autowired
    StudentRepo studentRepo;

    public void addStudent(Student student){
        studentRepo.save(student);
    }

    public Student getStudent(int id){

        return studentRepo.findById(id).orElse(new Student(-1, "NULL", -1, "NULL"));
    }

    public void updateStudent(Student student){
        studentRepo.save(student);
    }

    public void deleteStudent(int id){
        if (studentRepo.existsById(id)){
            studentRepo.deleteById(id);
        }
    }

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
}
