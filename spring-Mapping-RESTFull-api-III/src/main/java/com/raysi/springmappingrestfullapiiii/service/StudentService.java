package com.raysi.springmappingrestfullapiiii.service;

import com.raysi.springmappingrestfullapiiii.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    void saveStudent(Student student);
    Optional<String> getStudentSchoolName(Long id);

    List<Student> getStudents();
}
