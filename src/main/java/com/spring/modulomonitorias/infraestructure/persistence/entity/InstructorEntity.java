package com.spring.modulomonitorias.infraestructure.persistence.entity;

import com.spring.modulomonitorias.domain.model.Schedule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="instructor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InstructorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Schedule schedule;
}
