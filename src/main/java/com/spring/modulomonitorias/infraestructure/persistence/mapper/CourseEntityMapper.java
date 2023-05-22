package com.spring.modulomonitorias.infraestructure.persistence.mapper;

import com.spring.modulomonitorias.domain.model.Course;
import com.spring.modulomonitorias.infraestructure.persistence.entity.CourseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface CourseEntityMapper {

    CourseEntity toEntity(Course course);
    Course toCourse(CourseEntity courseEntity);
    List<Course> toCourseList(List<CourseEntity> courseEntityList);

}
