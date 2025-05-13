package com.example.demo.Repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Students;

@Repository
public interface Students_Repository extends JpaRepository<Students, Long> {
    // Custom query methods can be added here as needed
	@Query("SELECT s.name FROM Students s WHERE s.roomId = :roomId")
	List<String> findNamesByRoomId(@Param("roomId") Long roomId);
}