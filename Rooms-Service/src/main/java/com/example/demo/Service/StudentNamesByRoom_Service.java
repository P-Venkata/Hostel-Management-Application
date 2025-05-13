package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Feign_Client.AdmissionClient;

@Service
public class StudentNamesByRoom_Service {

    @Autowired
    private AdmissionClient admissionClient;

    public Object getNamesByRoomId(Long roomid) {
        return admissionClient.getStudentsByRoom(roomid);
    }
}