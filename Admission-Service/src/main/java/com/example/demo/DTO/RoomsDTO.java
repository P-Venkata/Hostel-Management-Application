package com.example.demo.DTO;


public class RoomsDTO {

    private Long roomid;
    private Integer count;

    public RoomsDTO() {
    }

    public RoomsDTO(Long roomid, Integer count) {
        this.roomid = roomid;
        this.count = count;
    }

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