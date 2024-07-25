package dev.ruchir.healwell.Repository;

import dev.ruchir.healwell.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository interface for Patient entity
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
