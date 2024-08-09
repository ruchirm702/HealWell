# HealWell Project Structure

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white)
![Razorpay](https://img.shields.io/badge/Razorpay-02042B?style=for-the-badge&logo=razorpay&logoColor=white)
![Stripe](https://img.shields.io/badge/Stripe-008CDD?style=for-the-badge&logo=stripe&logoColor=white)

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
