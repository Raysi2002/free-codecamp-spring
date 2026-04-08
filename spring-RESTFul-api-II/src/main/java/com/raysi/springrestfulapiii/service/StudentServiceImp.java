package com.raysi.springrestfulapiii.service;

import com.raysi.springrestfulapiii.entity.Student;
import com.raysi.springrestfulapiii.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService{

    private final StudentRepo repo;
    @Autowired
    public StudentServiceImp(StudentRepo repo){
        this.repo = repo;
    }

    @Override
    public void postStudents(List<Student> students) {
        repo.saveAll(students);

    }

    @Override
    public Optional<List<Student>> getAllStudent() {
        Optional<List<Student>> students = Optional.of(repo.findAll());
        return students;
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void postStudent(Student student) {
        repo.save(student);
    }

    @Override
    public List<Student> getStudentWithFirstNameContaining(String s) {
        return repo.getAllByFirstNameContaining(s);
    }

    @Override
    public List<Student> getStudentsWithFirstNameStartingWith(String s) {
        return repo.getAllByFirstNameStartingWith(s);
    }

    @Override
    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }


}
