package com.corvo.javact.repository;

import com.corvo.javact.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}
