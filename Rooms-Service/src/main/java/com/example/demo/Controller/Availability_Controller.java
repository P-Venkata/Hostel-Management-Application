package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.Rooms;
import com.example.demo.Service.Availability_Service;

import java.util.List;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/rooms")
public class Availability_Controller {

    @Autowired
    private Availability_Service availabilityService;

    @GetMapping("/availability")
    public List<Rooms> getAvailableRooms() {
        return availabilityService.getAllAvailableRooms();
    }
}