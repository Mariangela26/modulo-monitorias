package com.spring.modulomonitorias.application.mapper;

import com.spring.modulomonitorias.application.dto.InstructorDto;
import com.spring.modulomonitorias.domain.model.Instructor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface InstructorDtoMapper {

    InstructorDto toDto(Instructor instructor);
}
