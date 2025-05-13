package com.example.demo.Controller;

import com.example.demo.Service.StudentsByRoom_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/admission")
public class StudentsByRoom_Controller {

    @Autowired
    private StudentsByRoom_Service studentsByRoom_Service;

    @GetMapping("/students-by-room")
    public Object getStudentsByRoom(@RequestParam Long roomid) {
        Object response = studentsByRoom_Service.getStudentsByRoomId(roomid);

        if (response instanceof String) {
            return Map.of("message", (String) response); // ✅ Wrap plain text in JSON
        }

        return response; // ✅ Return list if successful
    }
}