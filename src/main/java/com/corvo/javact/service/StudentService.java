package com.corvo.javact.service;

import com.corvo.javact.model.Student;
import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents(); 
}