package com.spring.modulomonitorias.domain.spi;

import com.spring.modulomonitorias.domain.model.Schedule;

import java.util.List;

public interface ISchedulePersistencePort {

    Schedule saveSchedule(Schedule schedule);

    List<Schedule> getAllSchedule();

    void updateSchedule (Schedule schedule);

    void deleteSchedule(Long scheduleId);

}
