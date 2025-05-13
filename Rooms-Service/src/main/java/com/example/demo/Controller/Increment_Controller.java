package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.Rooms;
import com.example.demo.Service.Increment_Service;

@RestController
@RequestMapping("/rooms")
public class Increment_Controller {

    @Autowired
    private Increment_Service incrementService;

    @PutMapping("/increment")
    public Rooms incrementRoomCount(@RequestParam Long roomid) {
        return incrementService.incrementSeatCount(roomid);
    }
}