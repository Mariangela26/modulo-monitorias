package com.spring.modulomonitorias.application.dto;

import com.spring.modulomonitorias.domain.model.Instructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseResponse {
    private Long id;
    private String name;
    private Instructor instructor;
}
