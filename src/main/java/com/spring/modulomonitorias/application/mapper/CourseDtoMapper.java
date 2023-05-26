package com.spring.modulomonitorias.application.mapper;

import com.spring.modulomonitorias.application.dto.CourseDto;
import com.spring.modulomonitorias.domain.model.Course;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CourseDtoMapper {

    CourseDto toDto(Course course);
}
