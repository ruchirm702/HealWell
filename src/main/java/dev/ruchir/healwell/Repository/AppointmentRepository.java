package dev.ruchir.healwell.Repository;

import dev.ruchir.healwell.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    // Find appointments by patient ID and date range
    List<Appointment> findByPatientAndDateRange(Long patientId, LocalDateTime startDate,
                                                LocalDateTime endDate);
}
