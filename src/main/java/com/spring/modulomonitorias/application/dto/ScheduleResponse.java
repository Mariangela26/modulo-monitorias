package com.spring.modulomonitorias.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScheduleResponse {
    private Long id;
    private String day;
    private String startTime;
    private String endTime;
    private String place;
}
