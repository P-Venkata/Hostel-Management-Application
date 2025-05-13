package com.example.demo.Controller;

import com.example.demo.Entity.Students;
import com.example.demo.Service.StudentDetails_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admission")
public class StudentDetails_Controller {

    @Autowired
    private StudentDetails_Service studentDetailsService;

    @GetMapping("/student-details")
    public Object getStudentDetails(@RequestParam Long id) {
        Students student = studentDetailsService.getStudentDetailsById(id);
        if (student == null) {
            // Return a simple JSON object with a "message" key
            return Map.of("message", "Not Exist");
        }
        return student;
    }
}