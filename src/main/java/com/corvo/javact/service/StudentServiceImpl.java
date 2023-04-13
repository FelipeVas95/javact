package com.corvo.javact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corvo.javact.model.Student;
import com.corvo.javact.repository.StudentRepository;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
