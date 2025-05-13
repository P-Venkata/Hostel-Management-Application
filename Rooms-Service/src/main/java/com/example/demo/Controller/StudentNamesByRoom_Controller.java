package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.StudentNamesByRoom_Service;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/rooms")
public class StudentNamesByRoom_Controller {

    @Autowired
    private StudentNamesByRoom_Service studentNamesByRoomService;

    @GetMapping("/student-names")
    public Object getStudentNames(@RequestParam Long roomid) {
        return studentNamesByRoomService.getNamesByRoomId(roomid);
    }
}