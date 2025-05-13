package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.Students;
import com.example.demo.Service.Admission_Service;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/admissions")
public class Admission_Controller {

    @Autowired
    private Admission_Service admissionService;

    @PostMapping("/new")
    public Students admitStudent(@RequestBody Students student) {
        return admissionService.admitStudent(student);
    }
}