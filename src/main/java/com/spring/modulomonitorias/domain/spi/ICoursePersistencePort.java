package com.spring.modulomonitorias.domain.spi;

import com.spring.modulomonitorias.domain.model.Course;

import java.util.List;

public interface ICoursePersistencePort {

    Course saveCourse(Course course);

    List<Course> getAllCourse();

    Course getCourse(String nameCourse);

    void updateCourse(Course course);

    void deleteCourse(Long courseId);

}
