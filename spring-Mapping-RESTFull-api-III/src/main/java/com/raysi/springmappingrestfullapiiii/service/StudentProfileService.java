package com.raysi.springmappingrestfullapiiii.service;

import com.raysi.springmappingrestfullapiiii.entity.Student;
import com.raysi.springmappingrestfullapiiii.entity.StudentProfile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentProfileService {
    void saveStudentProfile(StudentProfile studentProfile);

    List<StudentProfile> getStudents();
}
