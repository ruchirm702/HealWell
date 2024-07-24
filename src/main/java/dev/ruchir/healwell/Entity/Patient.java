package dev.ruchir.healwell.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // JPA entity mapped to the "patient" table

public class Patient {

    @Id // specifies the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Auto-increment primary key
    private Long id;
    private String name;
    private String email;
    private String phone;
}
