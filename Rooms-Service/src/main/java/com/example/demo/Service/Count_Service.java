package com.example.demo.Service;



import com.example.demo.Repository.RoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Count_Service {

    @Autowired
    private RoomsRepository roomsRepository;

    public int getRoomCount(Long roomid) {
        return roomsRepository.findById(roomid).get().getCount();
    }
}