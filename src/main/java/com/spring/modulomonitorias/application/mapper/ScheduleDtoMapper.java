package com.spring.modulomonitorias.application.mapper;

import com.spring.modulomonitorias.application.dto.ScheduleDto;
import com.spring.modulomonitorias.domain.model.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ScheduleDtoMapper {

    ScheduleDto toDto(Schedule schedule);

}