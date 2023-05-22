package com.spring.modulomonitorias.infraestructure.persistence.mapper;

import com.spring.modulomonitorias.domain.model.Instructor;
import com.spring.modulomonitorias.domain.model.Schedule;
import com.spring.modulomonitorias.infraestructure.persistence.entity.InstructorEntity;
import com.spring.modulomonitorias.infraestructure.persistence.entity.ScheduleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface InstructorEntityMapper {

    InstructorEntity toEntity(Instructor instructor);
    Instructor toInstructor(InstructorEntity instructorEntity);
    List<Instructor> toInstructorList(List<InstructorEntity> instructorEntityList);

}
