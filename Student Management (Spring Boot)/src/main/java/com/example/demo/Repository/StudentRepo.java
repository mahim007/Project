package com.example.demo.Repository;

import com.example.demo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    Student findFirstByLang(String s);
    List<Student> findAllByLang(String s);
    List<Student> findAllByLangAndNameContaining(String lang, String s);
    List<Student> findAllByAgeGreaterThanEqualOrderByName(int age);

}
