package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms")
public class Rooms {

    @Id
    private Long roomid;

    private Integer count;

    // Constructors
    public Rooms() {}

    public Rooms(Long roomid, Integer count) {
        this.roomid = roomid;
        this.count = count;
    }

    // Getters and Setters
    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}