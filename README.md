Hostel-Management-Application : 
This is a microservices-based Hostel Management System built with Spring Boot, utilizing FeignClient for inter-service communication. Each microservice handles a specific responsibility like room management, admissions, rent payment, and student exit. Ensure all dependent services are running to avoid communication errors.

Key Features :
  • UI: Contains the frontend code integrated with multiple backend microservices for a seamless user experience.
	•	Room Management: View available rooms and manage room occupancy.
	•	Student Admission: Admit new students and assign them to available rooms.
	•	Rent Payment: Track and update rent payment status for each student.
	•	Student Exit: Manage the process of student quitting and free up rooms accordingly.
	•	Service Communication: Uses FeignClient for smooth RESTful communication between microservices.
 
Technology Stack :
Spring Boot – Java microservice framework Spring Cloud (Eureka) – Service discovery and registration Feign Client – For calling other microservices Spring Data JPA – ORM for database interaction MySQL – Persistent relational database

Microservices in This Project :
	•	Eureka Server – Acts as the service registry for all microservices.
	•	Room Service – Manages room details and availability status.
	•	Admission Service – Handles new student admissions and room allocations.
	•	Fee Service – Manages rent payment status for students.
	•	Reset Fees Service – Resets rent payment details for all students.
	•	Quit Service – Handles student exit processes and updates room availability accordingly.
 
Access the Services on These Default Ports :
	•	Rooms Service – http://localhost:8080
	•	Admission Service – http://localhost:8081
	•	Quit Service – http://localhost:8082
	•	Fees Service – http://localhost:8083
	•	Reset Fees Service – http://localhost:8084
	•	Eureka Server – http://localhost:8761
Notes
All services must be up and registered with Eureka Server for Feign Clients to function correctly.
