package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Students;

@Repository
public interface Students_Repository extends JpaRepository<Students, Long> {
    // Custom query methods can be added here as needed

}