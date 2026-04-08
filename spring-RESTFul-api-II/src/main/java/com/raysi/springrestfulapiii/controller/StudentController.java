package com.raysi.springrestfulapiii.controller;

import com.raysi.springrestfulapiii.entity.Student;
import com.raysi.springrestfulapiii.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //Get all student from DB
    @GetMapping("/api/students")
    ResponseEntity<Optional<List<Student>>> findAllStudent(){
        if (studentService.getAllStudent().isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .body(null);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.getAllStudent());
    }

    //Get a single Student by ID
    @GetMapping("/api/students/{student_id}")
    ResponseEntity<Optional<Student>> findStudentById(
            @PathVariable("student_id") Long id
    ){
        Optional<Student> student = studentService.getStudentById(id);
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .body(student);
    }

    //Get students whose name start with certain character # Working
//    @GetMapping("/api/students/search/{first_name}")
//    ResponseEntity<List<Student>> getByNameStartingWith(
//            @PathVariable("first_name") String s
//    ){
//        List<Student> students = studentService.getStudentWithFirstNameContaining(s);
//        return ResponseEntity
//                .status(HttpStatus.FOUND)
//                .body(students);
//    }

    @GetMapping("/api/students/search/{character}")
    ResponseEntity<List<Student>> getByNameStartingWith(
            @PathVariable("character") String s
    ){
        List<Student> students = studentService.getStudentsWithFirstNameStartingWith(s);
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .body(students);
    }

    //Save a single student
    @PostMapping("/api/student")
    ResponseEntity<Student> saveStudent(
            @RequestBody Student student
    ){
        studentService.postStudent(student);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(student);
    }

    //Save a list of students
    @PostMapping("/api/students")
    ResponseEntity<List<Student>> saveStudents(
            @RequestBody List<Student> students
            ){
        studentService.postStudents(students);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(students);
    }

    //Delete Student by ID
    @DeleteMapping("/api/students/{id}")
    ResponseEntity<Optional<Student>> deleteStudentById(
            @PathVariable Long id
    ){
        Optional<Student> student = studentService.getStudentById(id);
        studentService.deleteStudent(id);
        return ResponseEntity
                .status(HttpStatus.GONE)
                .body(student);
    }
}
