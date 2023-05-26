package com.spring.modulomonitorias.application.handler;

import com.spring.modulomonitorias.application.dto.InstructorRequest;
import com.spring.modulomonitorias.application.dto.InstructorResponse;

import java.util.List;

public interface IInstructorHandler {

    InstructorResponse saveInstructor(InstructorRequest instructorRequest);
    List<InstructorResponse> getAllInstructor();
    InstructorResponse getInstructor(Long instructorId);
    void updateInstructor(InstructorRequest instructorRequest, Long instructorId);
    void deleteInstructor(Long instructorId);
}
