package dev.ruchir.healwell.Controller;

import dev.ruchir.healwell.DTO.AppointmentDTO;
import dev.ruchir.healwell.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments") // Base URL for appointment-related endpoints
public class AppointmentController {

    @Autowired // Automatically injects the AppointmentService bean
    private AppointmentService appointmentService;

    @GetMapping
    public List<AppointmentDTO> getAllAppointments() {
        // Retrieve all appointments
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{id}")
    public AppointmentDTO getAppointmentById(@PathVariable Long id) {
        // Retrieve an appointment by ID
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping
    public AppointmentDTO createAppointment(@RequestBody AppointmentDTO appointmentDTO) {
        // Create a new appointment
        return appointmentService.saveAppointment(appointmentDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        // Delete an appointment by ID
        appointmentService.deleteAppointment(id);
    }
}
