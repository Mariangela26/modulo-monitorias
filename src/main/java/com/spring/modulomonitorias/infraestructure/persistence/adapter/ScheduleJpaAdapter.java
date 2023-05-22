package com.spring.modulomonitorias.infraestructure.persistence.adapter;

import com.spring.modulomonitorias.domain.model.Schedule;
import com.spring.modulomonitorias.domain.spi.ISchedulePersistencePort;
import com.spring.modulomonitorias.infraestructure.exception.NoDataFoundException;
import com.spring.modulomonitorias.infraestructure.persistence.entity.ScheduleEntity;
import com.spring.modulomonitorias.infraestructure.persistence.mapper.CourseEntityMapper;
import com.spring.modulomonitorias.infraestructure.persistence.mapper.ScheduleEntityMapper;
import com.spring.modulomonitorias.infraestructure.persistence.repository.IScheduleRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class ScheduleJpaAdapter implements ISchedulePersistencePort {

    private final IScheduleRepository scheduleRepository;
    private final ScheduleEntityMapper scheduleEntityMapper;

    @Override
    public Schedule saveSchedule(Schedule schedule) {
        ScheduleEntity scheduleEntity = scheduleRepository.save(scheduleEntityMapper.toEntity(schedule));
        return scheduleEntityMapper.toSchedule(scheduleEntity);
    }

    @Override
    public List<Schedule> getAllSchedule() {
        List<ScheduleEntity> scheduleEntityList = scheduleRepository.findAll();
        if(scheduleEntityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return scheduleEntityMapper.toScheduleList(scheduleEntityList);

    }

    @Override
    public void updateSchedule(Schedule schedule) {

        scheduleRepository.save(scheduleEntityMapper.toEntity(schedule));

    }

    @Override
    public void deleteSchedule(Long scheduleId) {

        scheduleRepository.deleteById(scheduleId);
    }
}
