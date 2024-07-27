package dev.ruchir.healwell.Service;

import dev.ruchir.healwell.DTO.AppointmentDTO;
import dev.ruchir.healwell.Entity.Appointment;
import dev.ruchir.healwell.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service // Marks this class as a service layer component
public class AppointmentService {

    @Autowired // Automatically injects the AppointmentRepository bean
    private AppointmentRepository appointmentRepository;

    // Retrieve all appointments and convert them to DTOs
    public List<AppointmentDTO> getAllAppointments() {
        return appointmentRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Retrieve an appointment by ID and convert it to a DTO
    public AppointmentDTO getAppointmentById(Long id) {
        return appointmentRepository.findById(id)
                .map(this::convertToDTO)
                .orElse(null);
    }

    // Save a new or existing appointment, converting it from DTO to entity and back to DTO
    public AppointmentDTO saveAppointment(AppointmentDTO appointmentDTO) {
        Appointment appointment = convertToEntity(appointmentDTO);
        return convertToDTO(appointmentRepository.save(appointment));
    }

    // Delete an appointment by ID
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }

    // Convert an Appointment entity to an AppointmentDTO
    private AppointmentDTO convertToDTO(Appointment appointment) {
        AppointmentDTO dto = new AppointmentDTO();
        dto.setId(appointment.getId());
        dto.setPatient(appointment.getPatient());
        dto.setAppointmentDate(appointment.getAppointmentDate());
        return dto;
    }

    // Convert an AppointmentDTO to an Appointment entity
    private Appointment convertToEntity(AppointmentDTO dto) {
        Appointment appointment = new Appointment();
        appointment.setId(dto.getId());
        appointment.setPatient(dto.getPatient());
        appointment.setAppointmentDate(dto.getAppointmentDate());
        return appointment;
    }
}
