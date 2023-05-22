package com.spring.modulomonitorias.domain.usecase;

import com.spring.modulomonitorias.domain.api.ICourseServicePort;
import com.spring.modulomonitorias.domain.model.Course;
import com.spring.modulomonitorias.domain.spi.ICoursePersistencePort;

import java.util.List;

public class CourseUseCase implements ICourseServicePort {

    private final ICoursePersistencePort coursePersistencePort;

    public CourseUseCase(ICoursePersistencePort coursePersistencePort) {
        this.coursePersistencePort = coursePersistencePort;
    }

    @Override
    public Course saveCourse(Course course) {
        return null;
    }

    @Override
    public List<Course> getAllCourse() {
        return null;
    }

    @Override
    public Course getCourse(Long courseId) {
        return null;
    }

    @Override
    public void updateCourse(Course course) {

    }

    @Override
    public void deleteCourse(Long courseId) {

    }
}
