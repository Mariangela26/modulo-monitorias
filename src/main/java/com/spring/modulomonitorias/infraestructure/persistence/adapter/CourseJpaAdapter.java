package com.spring.modulomonitorias.infraestructure.persistence.adapter;

import com.spring.modulomonitorias.domain.model.Course;
import com.spring.modulomonitorias.domain.spi.ICoursePersistencePort;
import com.spring.modulomonitorias.infraestructure.exception.NoDataFoundException;
import com.spring.modulomonitorias.infraestructure.persistence.entity.CourseEntity;
import com.spring.modulomonitorias.infraestructure.persistence.mapper.CourseEntityMapper;
import com.spring.modulomonitorias.infraestructure.persistence.repository.ICourseRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CourseJpaAdapter implements ICoursePersistencePort {

    private final ICourseRepository courseRepository;
    private final CourseEntityMapper courseEntityMapper;
    @Override
    public Course saveCourse(Course course) {

        CourseEntity courseEntity = courseRepository.save(courseEntityMapper.toEntity(course));
        return courseEntityMapper.toCourse(courseEntity);
    }

    @Override
    public List<Course> getAllCourse() {
        List<CourseEntity> courseEntityList = courseRepository.findAll();
        if(courseEntityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return courseEntityMapper.toCourseList(courseEntityList);

    }

    @Override
    public Course getCourse(Long courseId) {
        if(!courseRepository.findById(courseId).isPresent()){

        }
        return courseEntityMapper.toCourse(courseRepository.findById(courseId).orElseThrow());

    }

    @Override
    public void updateCourse(Course course) {

        courseRepository.save(courseEntityMapper.toEntity(course));

    }

    @Override
    public void deleteCourse(Long courseId) {

        courseRepository.deleteById(courseId);
    }
}
