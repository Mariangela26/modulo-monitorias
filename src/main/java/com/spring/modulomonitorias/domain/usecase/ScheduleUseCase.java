package com.spring.modulomonitorias.domain.usecase;

import com.spring.modulomonitorias.domain.api.IScheduleServicePort;
import com.spring.modulomonitorias.domain.model.Schedule;
import com.spring.modulomonitorias.domain.spi.ISchedulePersistencePort;

import java.util.List;

public class ScheduleUseCase implements IScheduleServicePort {

    private final ISchedulePersistencePort schedulePersistencePort;

    public ScheduleUseCase(ISchedulePersistencePort schedulePersistencePort) {
        this.schedulePersistencePort = schedulePersistencePort;
    }

    @Override
    public Schedule saveSchedule(Schedule schedule) {

        return schedulePersistencePort.saveSchedule(schedule);
    }

    @Override
    public List<Schedule> getAllSchedule() {

        return schedulePersistencePort.getAllSchedule();
    }

    @Override
    public void updateSchedule(Schedule schedule) {

        schedulePersistencePort.updateSchedule(schedule);
    }

    @Override
    public void deleteSchedule(Long scheduleId) {

        schedulePersistencePort.deleteSchedule(scheduleId);
    }
}
