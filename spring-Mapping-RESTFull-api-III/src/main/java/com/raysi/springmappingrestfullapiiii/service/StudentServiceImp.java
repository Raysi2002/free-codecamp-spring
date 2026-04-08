package com.raysi.springmappingrestfullapiiii.service;

import com.raysi.springmappingrestfullapiiii.entity.Student;
import com.raysi.springmappingrestfullapiiii.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService{
    private StudentRepository studentRepository;
    @Autowired
    public StudentServiceImp(StudentRepository repository){
        this.studentRepository = repository;
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Optional<String> getStudentSchoolName(Long id) {
        return null;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
