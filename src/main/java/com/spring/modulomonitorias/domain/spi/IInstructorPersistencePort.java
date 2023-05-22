package com.spring.modulomonitorias.domain.spi;

import com.spring.modulomonitorias.domain.model.Instructor;

import java.util.List;

public interface IInstructorPersistencePort {
    Instructor saveInstructor(Instructor instructor);

    List<Instructor> getAllInstructor();

    Instructor getInstructor(String nameInstructor);

    void updateInstructor (Instructor instructor);

    void deleteInstructor(Long instructorId);

}
