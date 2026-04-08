package com.raysi.springrestfulapiii.service;

import com.raysi.springrestfulapiii.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    void postStudents(List<Student> students);
    Optional<List<Student>> getAllStudent();
    Optional<Student> getStudentById(Long id);
    void postStudent(Student student);
    List<Student> getStudentWithFirstNameContaining(String s);
    List<Student> getStudentsWithFirstNameStartingWith(String s);
    void deleteStudent(Long id);
}
