package com.raysi.springmappingrestfullapiiii.controller;

import com.raysi.springmappingrestfullapiiii.entity.School;
import com.raysi.springmappingrestfullapiiii.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    private final SchoolService schoolService;
    @Autowired
    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/api/schools")
    public ResponseEntity<School> saveSchool(
            @RequestBody School school
    ){
        schoolService.saveSchool(school);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(school);

    }

    @GetMapping("/api/schools")
    public ResponseEntity<List<School>> getSchools(){
        List<School> schools= schoolService.getSchools();
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .body(schools);
    }
}
