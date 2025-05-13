package com.example.demo.Controller;

import com.example.demo.Service.Decrement_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/rooms")
public class Decrement_Controller {

    @Autowired
    private Decrement_Service decrementService;

    @PutMapping("/decrement")
    public Object decrementRoomCount(@RequestParam Long roomid) {
        return decrementService.decrementSeatCount(roomid);
    }
}