package com.spring.modulomonitorias.infraestructure.persistence.adapter;

import com.spring.modulomonitorias.domain.model.Instructor;
import com.spring.modulomonitorias.domain.spi.IInstructorPersistencePort;
import com.spring.modulomonitorias.infraestructure.exception.NoDataFoundException;
import com.spring.modulomonitorias.infraestructure.persistence.entity.InstructorEntity;
import com.spring.modulomonitorias.infraestructure.persistence.mapper.InstructorEntityMapper;
import com.spring.modulomonitorias.infraestructure.persistence.repository.IInstructorRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class InstructorJpaAdapter implements IInstructorPersistencePort {

    private final IInstructorRepository instructorRepository;
    private final InstructorEntityMapper instructorEntityMapper;

    @Override
    public Instructor saveInstructor(Instructor instructor) {
        InstructorEntity instructorEntity = instructorRepository.save(instructorEntityMapper.toEntity(instructor));
        return instructorEntityMapper.toInstructor(instructorEntity);
    }

    @Override
    public List<Instructor> getAllInstructor() {
        List<InstructorEntity> instructorEntityList = instructorRepository.findAll();
        if(instructorEntityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return instructorEntityMapper.toInstructorList(instructorEntityList);
    }

    @Override
    public Instructor getInstructor(Long instructorId) {
        if(!instructorRepository.findById(instructorId).isPresent()){

        }
        return instructorEntityMapper.toInstructor(instructorRepository.findById(instructorId).orElseThrow());
    }

    @Override
    public void updateInstructor(Instructor instructor) {

        instructorRepository.save(instructorEntityMapper.toEntity(instructor));
    }

    @Override
    public void deleteInstructor(Long instructorId) {
        instructorRepository.deleteById(instructorId);
    }
}
