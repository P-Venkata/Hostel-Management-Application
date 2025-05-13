package com.example.demo.Feign_Client;


import com.example.demo.DTO.RoomsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "rooms-service")
public interface RoomsServiceClient {

    @GetMapping("/rooms/count")
    int getRoomCount(@RequestParam("roomid") Long roomid);

    @PutMapping("/rooms/increment")
    RoomsDTO incrementRoomCount(@RequestParam("roomid") Long roomid);
}