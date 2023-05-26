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

        return instructorPersistencePort.saveInstructor(instructor);
    }

    @Override
    public List<Instructor> getAllInstructor() {
        return instructorPersistencePort.getAllInstructor();
    }

    @Override
    public Instructor getInstructor(Long instructorId) {

        return instructorPersistencePort.getInstructor(instructorId);
    }

    @Override
    public void updateInstructor(Instructor instructor) {

        instructorPersistencePort.updateInstructor(instructor);
    }

    @Override
    public void deleteInstructor(Long instructorId) {

        instructorPersistencePort.deleteInstructor(instructorId);
    }
}
