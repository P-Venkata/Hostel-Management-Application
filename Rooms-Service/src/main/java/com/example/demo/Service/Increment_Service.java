package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Rooms;
import com.example.demo.Repository.RoomsRepository;

@Service
public class Increment_Service {

    @Autowired
    private RoomsRepository roomsRepository;

    public Rooms incrementSeatCount(Long roomid) {
        Rooms room = roomsRepository.findById(roomid).get(); // Assumes roomid exists
        room.setCount(room.getCount() + 1);
        return roomsRepository.save(room);
    }
}