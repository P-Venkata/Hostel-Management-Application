package com.example.demo.Feign_Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.example.demo.DTO.StudentDTO;
@FeignClient(name = "admission-service", url = "http://localhost:8081")
public interface AdmissionClient {

    @GetMapping("/admission/student-details")
    StudentDTO getStudentDetails(@RequestParam("id") Long id);

    @GetMapping("/admission/students-by-room")
    Object getStudentsByRoom(@RequestParam("roomid") Long roomid);
}