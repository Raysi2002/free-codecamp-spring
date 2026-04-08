package com.raysi.springmappingrestfullapiiii.controller;

import com.raysi.springmappingrestfullapiiii.entity.StudentProfile;
import com.raysi.springmappingrestfullapiiii.service.StudentProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentProfileController {
    private final StudentProfileService studentProfileService;

    public StudentProfileController(StudentProfileService studentProfileService) {
        this.studentProfileService = studentProfileService;
    }

    @PostMapping("/api/student_profiles")
    ResponseEntity<StudentProfile> saveStudentProfile(
            @RequestBody StudentProfile studentProfile
    ){
        studentProfileService.saveStudentProfile(studentProfile);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(studentProfile);
    }
    @GetMapping("/api/student_profiles")
    ResponseEntity<List<StudentProfile>> getStudents(){
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .body(studentProfileService.getStudents());

    }
}
