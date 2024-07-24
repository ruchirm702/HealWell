package dev.ruchir.healwell.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

@Entity // JPA entity mapped to the " appointment" table

public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // many appointment for one patient
    @JoinColumn(name = "patient_id")
    private Patient patient;  //The patient linked to this appointment
    private LocalDateTime appointmentDate;
}
