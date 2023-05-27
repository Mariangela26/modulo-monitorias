package com.spring.modulomonitorias.application.handler;

import com.spring.modulomonitorias.application.dto.*;

import java.util.List;

public interface ICourseHandler {

    CourseResponse saveCourse(CourseRequest courseRequest);
    List<CourseResponse> getAllCourse();
    CourseResponse getCourse(Long courseId);
    void updateCourse(CourseRequest courseRequest, Long courseId);
    void deleteCourse(Long courseId);
}
