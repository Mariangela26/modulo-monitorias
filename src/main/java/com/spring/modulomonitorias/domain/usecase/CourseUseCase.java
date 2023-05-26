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

        return coursePersistencePort.saveCourse(course);
    }

    @Override
    public List<Course> getAllCourse() {

        return coursePersistencePort.getAllCourse();
    }

    @Override
    public Course getCourse(Long courseId) {

        return coursePersistencePort.getCourse(courseId);
    }

    @Override
    public void updateCourse(Course course) {

        coursePersistencePort.updateCourse(course);
    }

    @Override
    public void deleteCourse(Long courseId) {

        coursePersistencePort.deleteCourse(courseId);
    }
}
