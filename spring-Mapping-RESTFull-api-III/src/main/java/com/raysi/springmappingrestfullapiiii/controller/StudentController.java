package com.raysi.springmappingrestfullapiiii.controller;

import com.raysi.springmappingrestfullapiiii.entity.Student;
import com.raysi.springmappingrestfullapiiii.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/api/students")
    ResponseEntity<Student> saveStudent(
            @RequestBody Student student
    ){
        studentService.saveStudent(student);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(student);
    }

    //Trying to get student school name
    @GetMapping("/api/students")
    ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .body(studentService.getStudents());

    }
}
