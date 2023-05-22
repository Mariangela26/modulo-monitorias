package com.spring.modulomonitorias.infraestructure.persistence.repository;

import com.spring.modulomonitorias.infraestructure.persistence.entity.InstructorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInstructorRepository extends JpaRepository<InstructorEntity, Long> {
}
