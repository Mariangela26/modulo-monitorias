package com.spring.modulomonitorias.infraestructure.persistence.repository;

import com.spring.modulomonitorias.infraestructure.persistence.entity.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IScheduleRepository extends JpaRepository<ScheduleEntity, Long> {
}
