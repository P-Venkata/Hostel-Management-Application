package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;

    @Column(name = "room_id")
    private Long roomId;

    private Double rent = 6000.00; // Optional default in Java layer

    @Column(name = "rent_payed")
    private Boolean rentPayed = false;

    public Students() {}

    public Students(String name, String phoneNumber, String email, Long roomId, Double rent, Boolean rentPayed) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.roomId = roomId;
        this.rent = rent;
        this.rentPayed = rentPayed;
    }

    // Getters and setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public Long getRoomId() { return roomId; }

    public void setRoomId(Long roomId) { this.roomId = roomId; }

    public Double getRent() { return rent; }

    public void setRent(Double rent) { this.rent = rent; }

    public Boolean getRentPayed() { return rentPayed; }

    public void setRentPayed(Boolean rentPayed) { this.rentPayed = rentPayed; }
}