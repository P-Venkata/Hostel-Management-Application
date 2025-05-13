package com.example.demo.Service;

import com.example.demo.Entity.Students;
import com.example.demo.Repository.Students_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDetails_Service {

    @Autowired
    private Students_Repository studentsRepository;

    public Students getStudentDetailsById(Long studentId) {
        return studentsRepository.findById(studentId).orElse(null);
    }
}