package com.example.demo.Feign_Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Rooms-Service")
public interface RoomsServiceClient {

    @PutMapping("/rooms/decrement")
    Object decrementRoomCount(@RequestParam("roomid") Long roomid);
}