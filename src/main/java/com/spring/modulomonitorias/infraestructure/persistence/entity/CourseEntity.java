package com.spring.modulomonitorias.infraestructure.persistence.entity;

import com.spring.modulomonitorias.domain.model.Instructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
    String name;
    //Instructor instructor; ESTE ERA EL ERROR

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id")
    private InstructorEntity instructorEntity;

}
