package com.spring.modulomonitorias.infraestructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="schedule")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String day;
    private String startTime;
    private String endTime;
    private String place;

    @OneToMany
    @JoinColumn(name = "instructor_id")
    private List<InstructorEntity> instructorEntityList;
}
