package com.example.demo.Service;
import com.example.demo.Entity.Rooms;
import com.example.demo.Repository.RoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Decrement_Service {

    @Autowired
    private RoomsRepository roomsRepository;

    public Object decrementSeatCount(Long roomid) {
        // ✅ Validate room ID range
        if (roomid < 1 || roomid > 6) {
            return "Invalid room ID. Only rooms 1 to 6 are allowed.";
        }

        Optional<Rooms> optionalRoom = roomsRepository.findById(roomid);
        if (!optionalRoom.isPresent()) {
            return "Room not found for ID: " + roomid;
        }

        Rooms room = optionalRoom.get();

        if (room.getCount() > 0) {
            room.setCount(room.getCount() - 1);
        }

        return roomsRepository.save(room);
    }
}