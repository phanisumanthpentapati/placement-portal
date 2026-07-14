package com.sumanth.placementportal.controller;

import com.sumanth.placementportal.entity.Student;
import com.sumanth.placementportal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:5173")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/register")
    public Student registerStudent(@RequestBody Student student) {

        System.out.println("===== REGISTER API HIT =====");
        System.out.println(student.getName());

        return studentService.saveStudent(student);
    }
}