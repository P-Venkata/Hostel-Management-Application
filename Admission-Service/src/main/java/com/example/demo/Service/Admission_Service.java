package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Students;
import com.example.demo.Feign_Client.RoomsServiceClient;
import com.example.demo.Repository.Students_Repository;

@Service
public class Admission_Service {

    @Autowired
    private Students_Repository studentsRepository;

    @Autowired
    private RoomsServiceClient roomsServiceClient;

    public Students admitStudent(Students student) {
        Long roomId = student.getRoomId();

        // ✅ Validate room ID range
        if (roomId < 1 || roomId > 6) {
            throw new RuntimeException("Invalid room ID. Only rooms 1 to 6 are allowed.");
        }

        // ✅ Fetch current room count
        int currentCount = roomsServiceClient.getRoomCount(roomId);

        // ✅ Check capacity
        if (currentCount >= 20) {
            throw new RuntimeException("Room is full. Cannot admit more than 20 students.");
        }

        // ✅ Save student
        Students savedStudent = studentsRepository.save(student);

        // ✅ Increment room count
        roomsServiceClient.incrementRoomCount(roomId);

        return savedStudent;
    }
}