package com.spring.modulomonitorias.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Schedule {


    private Long id;
    private String day;
    private String startTime;
    private String endTime;
    private String place;


}
