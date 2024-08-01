# HealWell Project Structure

[![Java](https://img.shields.io/badge/Java-17-green)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0-blue)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.8.4-red)](https://maven.apache.org)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

### Project Hierarchy

```plaintext
healwell/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── dev/
│   │   │       └── ruchir/
│   │   │           └── healwell/
│   │   │               ├── controller/
│   │   │               │   ├── PatientController.java
│   │   │               │   ├── AppointmentController.java
│   │   │               ├── entity/
│   │   │               │   ├── Patient.java
│   │   │               │   ├── Appointment.java
│   │   │               ├── repository/
│   │   │               │   ├── PatientRepository.java
│   │   │               │   ├── AppointmentRepository.java
│   │   │               ├── service/
│   │   │               │   ├── PatientService.java
│   │   │               │   ├── AppointmentService.java
│   │   │               ├── dto/
│   │   │               │   ├── PatientDTO.java
│   │   │               │   ├── AppointmentDTO.java
│   │   │               ├── exception/
│   │   │               │   ├── GlobalExceptionHandler.java
│   │   │               │   ├── ResourceNotFoundException.java
│   │   │               ├── config/
│   │   │               │   ├── SwaggerConfig.java
│   │   │               ├── HealthcareApplication.java
│   ├── resources/
│   │   ├── application.properties
├── README.md
├── pom.xml

```

## Features

- **Patient Management**: CRUD operations for managing patient records.
- **Appointment Scheduling**: CRUD operations for managing appointments.
- **MySQL Integration**: Utilizes MySQL as the database.

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.6 or later
- MySQL 8.0 or later

### Clone the Repository

```bash
git clone https://github.com/yourusername/HealWell.git
cd HealWell
```
### Configure the Database
Update the src/main/resources/application.properties file with your MySQL database credentials:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/healthcare_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Access the API:
- Patients: http://localhost:8080/patients
- Appointments: http://localhost:8080/appointments

## API Endpoints

#### Patients
- GET /patients - Get all patients
- GET /patients/{id} - Get a patient by ID
- POST /patients - Create a new patient
- DELETE /patients/{id} - Delete a patient by ID
  
#### Appointments
- GET /appointments - Get all appointments
- GET /appointments/{id} - Get an appointment by ID
- POST /appointments - Create a new appointment
- DELETE /appointments/{id} - Delete an appointment by ID

###  Contributing
Contributions are welcome! Please fork the repository and submit a pull request with your changes.
