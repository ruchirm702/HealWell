package dev.ruchir.healwell.Repository;

import dev.ruchir.healwell.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
// Repository interface for Patient entity
public interface PatientRepository extends JpaRepository<Patient, Long> {

    // Search patients by name, email, and phone
    List<Patient> searchByDetails(String name, String email, String phone);
}
