package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.Quit_Service;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/quit")
public class Quit_Controller {

    @Autowired
    private Quit_Service quitService;

    @DeleteMapping("/remove-student")
    public String removeStudent(@RequestParam Long id) {
        return quitService.quitStudent(id);
    }
}