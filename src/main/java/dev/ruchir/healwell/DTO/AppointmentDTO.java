package dev.ruchir.healwell.DTO;

import dev.ruchir.healwell.Entity.Patient;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AppointmentDTO {

    private Long id;
    private Patient patient;
    private LocalDateTime appointmentDate;
}
