package com.spring.modulomonitorias.application.handler;

import com.spring.modulomonitorias.application.dto.CourseRequest;
import com.spring.modulomonitorias.application.dto.CourseResponse;
import com.spring.modulomonitorias.application.dto.InstructorRequest;
import com.spring.modulomonitorias.application.dto.InstructorResponse;

import java.util.List;

public interface ICourseHandler {

    CourseResponse saveCourse(CourseRequest courseRequest);
    List<CourseResponse> getAllCourse();
    CourseResponse getCourse(Long courseId);
    void updateCourse(CourseRequest courseRequest, Long courseId);
    void deleteCourse(Long courseId);
}
