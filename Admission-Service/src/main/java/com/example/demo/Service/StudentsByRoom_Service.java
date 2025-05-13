package com.example.demo.Service;


import com.example.demo.Repository.Students_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsByRoom_Service {

    @Autowired
    private Students_Repository studentsRepository;

    public Object getStudentsByRoomId(Long roomId) {
        if (roomId < 1 || roomId > 6) {
            return "Invalid room ID. Only rooms 1 to 6 are allowed.";
        }

        List<String> studentNames = studentsRepository.findNamesByRoomId(roomId);

        if (studentNames.isEmpty()) {
            return "No students found in this room.";
        }

        return studentNames;
    }
}