package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.Count_Service;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/rooms")
public class Count_Controller {

    @Autowired
    private Count_Service countService;

    @GetMapping("/count")
    public int getRoomCount(@RequestParam Long roomid) {
        return countService.getRoomCount(roomid);
    }
}