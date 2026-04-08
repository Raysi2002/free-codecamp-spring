package com.raysi.springmappingrestfullapiiii.service;


import com.raysi.springmappingrestfullapiiii.entity.Student;
import com.raysi.springmappingrestfullapiiii.entity.StudentProfile;
import com.raysi.springmappingrestfullapiiii.repository.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentProfileServiceImp implements StudentProfileService {
    private StudentProfileRepository studentProfileRepository;
    @Autowired
    public StudentProfileServiceImp(StudentProfileRepository studentProfileRepository) {
        this.studentProfileRepository = studentProfileRepository;
    }

    @Override
    public void saveStudentProfile(StudentProfile studentProfile) {
        studentProfileRepository.save(studentProfile);
    }

    @Override
    public List<StudentProfile> getStudents() {
        return studentProfileRepository.findAll();
    }
}
