package com.spring.modulomonitorias.domain.api;

import com.spring.modulomonitorias.domain.model.Course;

import java.util.List;

public interface ICourseServicePort {

    Course saveCourse(Course course);

    List<Course> getAllCourse();

    Course getCourse(String nameCourse);

    void updateCourse(Course course);

    void deleteCourse(Long courseId);

}
