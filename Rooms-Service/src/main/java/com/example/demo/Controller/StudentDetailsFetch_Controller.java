package com.example.demo.Controller;


import com.example.demo.Service.StudentDetailsFetch_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/fetch")
public class StudentDetailsFetch_Controller {

    @Autowired
    private StudentDetailsFetch_Service studentDetailsFetchService;

    @GetMapping("/student-by-id")
    public Object getStudentById(@RequestParam Long id) {
        return studentDetailsFetchService.getStudentDetailsById(id);
    }
}