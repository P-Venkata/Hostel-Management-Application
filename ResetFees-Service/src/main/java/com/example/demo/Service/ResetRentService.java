package com.example.demo.Service;

import com.example.demo.Entity.Students;
import com.example.demo.Repository.Students_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResetRentService {

    @Autowired
    private Students_Repository studentsRepository;

    public String resetAllRentPayedToFalse() {
        List<Students> students = studentsRepository.findAll();

        if (students.isEmpty()) {
            return "No students found in the database.";
        }

        for (Students student : students) {
            student.setRentPayed(false);
        }

        studentsRepository.saveAll(students);

        return "Successfully set rentPayed = false for all students.";
    }
}