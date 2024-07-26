package dev.ruchir.healwell.Service;

import dev.ruchir.healwell.Entity.Patient;
import dev.ruchir.healwell.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {


    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        // Retrieve all patients
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        // Retrieve a patient by ID, return null if not found
        return patientRepository.findById(id).orElse(null);
    }

    public Patient savePatient(Patient patient) {
        // Save a new or existing patient
        return patientRepository.save(patient);
    }

    public void deletePatient(Long id) {
        // Delete a patient by ID
        patientRepository.deleteById(id);
    }
}
