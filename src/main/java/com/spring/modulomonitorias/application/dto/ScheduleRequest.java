package com.spring.modulomonitorias.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScheduleRequest {
    private Long id;
    private String day;
    private String startTime;
    private String endTime;
    private String place;
}
