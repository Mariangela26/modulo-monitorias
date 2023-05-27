package com.spring.modulomonitorias.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Instructor {
    private Long id;
    private String name;
    private Schedule schedule;
    private List<Course> courseList;


}
