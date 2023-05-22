package com.spring.modulomonitorias.domain.usecase;

import com.spring.modulomonitorias.domain.api.IInstructorServicePort;
import com.spring.modulomonitorias.domain.model.Instructor;
import com.spring.modulomonitorias.domain.spi.IInstructorPersistencePort;

import java.util.List;

public class InstructorUseCase implements IInstructorServicePort {

    private final IInstructorPersistencePort instructorPersistencePort;

    public InstructorUseCase(IInstructorPersistencePort instructorPersistencePort) {
        this.instructorPersistencePort = instructorPersistencePort;
    }

    @Override
    public Instructor saveInstructor(Instructor instructor) {
        return null;
    }

    @Override
    public List<Instructor> getAllInstructor() {
        return null;
    }

    @Override
    public Instructor getInstructor(String nameInstructor) {
        return null;
    }

    @Override
    public void updateInstructor(Instructor instructor) {

    }

    @Override
    public void deleteInstructor(Long instructorId) {

    }
}
