package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Students;
import com.example.demo.Feign_Client.RoomsServiceClient;
import com.example.demo.Repository.Students_Repository;

@Service
public class Quit_Service {

    @Autowired
    private Students_Repository studentsRepository;

    @Autowired
    private RoomsServiceClient roomsServiceClient;

    public String quitStudent(Long id) {
        Students student = studentsRepository.findById(id).orElse(null);

        if (student == null) {
            return "Student ID not found.";
        }

        Long roomId = student.getRoomId();

        // Delete student from DB
        studentsRepository.deleteById(id);

        // Call Rooms-Service to decrement room count
        roomsServiceClient.decrementRoomCount(roomId);

        return "Student removed successfully and room count decremented.";
    }
}