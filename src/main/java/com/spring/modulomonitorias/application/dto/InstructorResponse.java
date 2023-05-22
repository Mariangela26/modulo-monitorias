package com.spring.modulomonitorias.application.dto;

import com.spring.modulomonitorias.domain.model.Schedule;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstructorResponse {
    private Long id;
    private String name;
    private Schedule schedule;
}
