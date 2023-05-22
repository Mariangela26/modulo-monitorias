package com.spring.modulomonitorias.infraestructure.configuration;

import com.spring.modulomonitorias.domain.spi.ICoursePersistencePort;
import com.spring.modulomonitorias.domain.spi.IInstructorPersistencePort;
import com.spring.modulomonitorias.domain.spi.ISchedulePersistencePort;
import com.spring.modulomonitorias.infraestructure.persistence.adapter.CourseJpaAdapter;
import com.spring.modulomonitorias.infraestructure.persistence.adapter.InstructorJpaAdapter;
import com.spring.modulomonitorias.infraestructure.persistence.adapter.ScheduleJpaAdapter;
import com.spring.modulomonitorias.infraestructure.persistence.mapper.CourseEntityMapper;
import com.spring.modulomonitorias.infraestructure.persistence.mapper.InstructorEntityMapper;
import com.spring.modulomonitorias.infraestructure.persistence.mapper.ScheduleEntityMapper;
import com.spring.modulomonitorias.infraestructure.persistence.repository.ICourseRepository;
import com.spring.modulomonitorias.infraestructure.persistence.repository.IInstructorRepository;
import com.spring.modulomonitorias.infraestructure.persistence.repository.IScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ICourseRepository courseRepository;
    private final IInstructorRepository instructorRepository;
    private final IScheduleRepository scheduleRepository;

    private final CourseEntityMapper courseEntityMapper;
    private final InstructorEntityMapper instructorEntityMapper;
    private final ScheduleEntityMapper scheduleEntityMapper;

    //TODO: validar si se necesita bean para los serviceport
    @Bean
    public ICoursePersistencePort coursePersistencePort(){
        return new CourseJpaAdapter(courseRepository, courseEntityMapper);
    }

    @Bean
    public IInstructorPersistencePort instructorPersistencePort(){
        return new InstructorJpaAdapter(instructorRepository, instructorEntityMapper);
    }

    @Bean
    public ISchedulePersistencePort schedulePersistencePort (){
        return new ScheduleJpaAdapter(scheduleRepository, scheduleEntityMapper);
    }
}