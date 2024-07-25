package dev.ruchir.healwell.Controller;

import dev.ruchir.healwell.Entity.Patient;
import dev.ruchir.healwell.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients") // Base URL for patient-related endpoints
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients() {
        // Retrieve all patients
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        // Retrieve a patient by ID
        return patientService.getPatientById(id);
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        // Create a new patient
        return patientService.savePatient(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        // Delete a patient by ID
        patientService.deletePatient(id);
    }
}
