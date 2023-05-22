package com.spring.modulomonitorias.domain.api;

import com.spring.modulomonitorias.domain.model.Instructor;

import java.util.List;

public interface IInstructorServicePort {

    Instructor saveInstructor(Instructor instructor);

    List<Instructor> getAllInstructor();

    Instructor getInstructor(Long instructorId);

    void updateInstructor (Instructor instructor);

    void deleteInstructor(Long instructorId);

}
