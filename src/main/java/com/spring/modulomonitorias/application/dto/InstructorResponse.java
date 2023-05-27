package com.spring.modulomonitorias.application.dto;

import com.spring.modulomonitorias.domain.model.Course;
import com.spring.modulomonitorias.domain.model.Schedule;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InstructorResponse {
    private Long id;
    private String name;
    private Schedule schedule;
    private List<Course> courseList;
}
