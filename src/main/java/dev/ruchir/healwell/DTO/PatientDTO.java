package dev.ruchir.healwell.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
}
