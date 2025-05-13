package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ResetRentService;


@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/fees")
public class ResetRentController {

    @Autowired
    private ResetRentService resetRentService;

    @PutMapping("/reset-all-rents")
    public String resetAllRents() {
        return resetRentService.resetAllRentPayedToFalse();
    }
}