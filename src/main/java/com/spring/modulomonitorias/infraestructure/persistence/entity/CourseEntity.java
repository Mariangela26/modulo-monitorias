package com.spring.modulomonitorias.infraestructure.persistence.entity;

import com.spring.modulomonitorias.domain.model.Instructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="course")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Instructor instructor;

}
