package com.example.demo.Service;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.Feign_Client.AdmissionClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentDetailsFetch_Service {

    @Autowired
    private AdmissionClient admissionClient;

    public Object getStudentDetailsById(Long id) {
        try {
            StudentDTO student = admissionClient.getStudentDetails(id);
            if (student == null || student.getId() == null) {
                return createMessage("Student ID not found.");
            }
            return student;
        } catch (Exception e) {
            return createMessage("Error fetching student: " + e.getMessage());
        }
    }

    private Map<String, String> createMessage(String msg) {
        Map<String, String> response = new HashMap<>();
        response.put("message", msg);
        return response;
    }
}