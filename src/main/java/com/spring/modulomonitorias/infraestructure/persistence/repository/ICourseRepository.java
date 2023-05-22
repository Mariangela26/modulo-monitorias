package com.spring.modulomonitorias.infraestructure.persistence.repository;

import com.spring.modulomonitorias.infraestructure.persistence.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<CourseEntity, Long> {
}
