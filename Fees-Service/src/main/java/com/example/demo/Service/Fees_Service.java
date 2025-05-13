package com.example.demo.Service;

import com.example.demo.Entity.Students;
import com.example.demo.Repository.Students_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Fees_Service {

    @Autowired
    private Students_Repository studentsRepository;

    public String markRentAsPaid(Long id) {
        Students student = studentsRepository.findById(id).orElse(null);

        if (student == null) {
            return "Student ID not found.";
        }

        student.setRentPayed(true);
        studentsRepository.save(student);

        return "Rent marked as paid for student ID: " + id;
    }
}