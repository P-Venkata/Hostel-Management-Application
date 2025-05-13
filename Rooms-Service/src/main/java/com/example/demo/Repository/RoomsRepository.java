package com.example.demo.Repository;


import com.example.demo.Entity.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms, Long> {
    // You can define custom query methods here if needed
}