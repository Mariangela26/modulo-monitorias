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
    String dayDate;
    String startTime;
    String endTime;
    String place;

    @OneToMany(mappedBy = "scheduleEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name = "instructor_id")
    private List<InstructorEntity> instructorEntityList;
}
