package com.spring.modulomonitorias.application.handler;

import com.spring.modulomonitorias.application.dto.InstructorRequest;
import com.spring.modulomonitorias.application.dto.InstructorResponse;
import com.spring.modulomonitorias.application.dto.ScheduleRequest;
import com.spring.modulomonitorias.application.dto.ScheduleResponse;

import java.util.List;

public interface IScheduleHandler {

    ScheduleResponse saveSchedule(ScheduleRequest scheduleRequest);
    List<ScheduleResponse> getAllSchedule();
    void updateSchedule(ScheduleRequest scheduleRequest, Long scheduleId);
    void deleteSchedule(Long scheduleId);
}
