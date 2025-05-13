package com.example.demo.Controller;

import com.example.demo.Service.Fees_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/fees")
public class Fees_Controller {

    @Autowired
    private Fees_Service feesService;

    @PutMapping("/pay")
    public String payRent(@RequestParam Long id) {
        return feesService.markRentAsPaid(id);
    }
}