package com.spring.modulomonitorias.application.handler;

import com.spring.modulomonitorias.application.dto.CourseRequest;
import com.spring.modulomonitorias.application.dto.CourseResponse;
import com.spring.modulomonitorias.application.mapper.CourseRequestMapper;
import com.spring.modulomonitorias.application.mapper.CourseResponseMapper;
import com.spring.modulomonitorias.domain.api.ICourseServicePort;
import com.spring.modulomonitorias.domain.model.Course;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CourseHandler implements ICourseHandler{

    private final ICourseServicePort courseServicePort;
    private final CourseRequestMapper courseRequestMapper;
    private final CourseResponseMapper courseResponseMapper;

    @Override
    public CourseResponse saveCourse(CourseRequest courseRequest) {

        Course course = courseServicePort.saveCourse(courseRequestMapper.toCourse(courseRequest));

        return courseResponseMapper.toResponse(course);
    }

    @Override
    public List<CourseResponse> getAllCourse() {

        return courseResponseMapper.toResponseList(courseServicePort.getAllCourse());

    }

    @Override
    public CourseResponse getCourse(Long courseId) {

        Course course = courseServicePort.getCourse(courseId);
        return courseResponseMapper.toResponse(course);
    }

    @Override
    public void updateCourse(CourseRequest courseRequest, Long courseId) {
        Course oldCourse = courseServicePort.getCourse(courseId);
        Course newCourse = courseRequestMapper.toCourse(courseRequest);
        newCourse.setId(oldCourse.getId());
        courseServicePort.updateCourse(newCourse);
    }

    @Override
    public void deleteCourse(Long courseId) {
        Course course = courseServicePort.getCourse(courseId);
        courseServicePort.deleteCourse(courseId);
    }
}
