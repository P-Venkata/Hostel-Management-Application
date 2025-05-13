package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Rooms;
import com.example.demo.Repository.RoomsRepository;

import java.util.List;

@Service
public class Availability_Service {

    @Autowired
    private RoomsRepository roomsRepository;

    public List<Rooms> getAllAvailableRooms() {
        return roomsRepository.findAll(); // Optional: add filtering here
    }
}