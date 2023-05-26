package com.spring.modulomonitorias.application.handler;

import com.spring.modulomonitorias.application.dto.ScheduleRequest;
import com.spring.modulomonitorias.application.dto.ScheduleResponse;
import com.spring.modulomonitorias.application.mapper.ScheduleRequestMapper;
import com.spring.modulomonitorias.application.mapper.ScheduleResponseMapper;
import com.spring.modulomonitorias.domain.api.IScheduleServicePort;
import com.spring.modulomonitorias.domain.model.Schedule;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ScheduleHandler implements IScheduleHandler{

    private final IScheduleServicePort scheduleServicePort;
    private final ScheduleRequestMapper scheduleRequestMapper;
    private final ScheduleResponseMapper scheduleResponseMapper;
    @Override
    public ScheduleResponse saveSchedule(ScheduleRequest scheduleRequest) {
        Schedule schedule = scheduleServicePort.saveSchedule(scheduleRequestMapper.toSchedule(scheduleRequest));
        return scheduleResponseMapper.toResponse(schedule);
    }

    @Override
    public List<ScheduleResponse> getAllSchedule() {
        return scheduleResponseMapper.toResponseList(scheduleServicePort.getAllSchedule());
    }

    @Override
    public void updateSchedule(ScheduleRequest scheduleRequest, Long scheduleId) {

        //Schedule oldSchedule = s
        //TODO: falta obtener por id
    }

    @Override
    public void deleteSchedule(Long scheduleId) {

    }
}
