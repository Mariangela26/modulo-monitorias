package com.spring.modulomonitorias.infraestructure.input;

import com.spring.modulomonitorias.application.dto.ScheduleRequest;
import com.spring.modulomonitorias.application.handler.IScheduleHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class EndPointPutSchedule {

    private final IScheduleHandler scheduleHandler;

    @Operation(summary = "Update an existing schedule")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Schedule updated", content = @Content),
            @ApiResponse(responseCode = "404", description = "Schedule not found", content = @Content)
    })
    @PutMapping("/{scheduleId}")
    public ResponseEntity<Void> updateSchedule(@RequestBody ScheduleRequest scheduleRequest,
                                           @Parameter(description = "Id of the schedule to be modified")
                                           @PathVariable(name = "scheduleId")Long scheduleId){
        scheduleHandler.updateSchedule(scheduleRequest, scheduleId);
        return ResponseEntity.noContent().build();
    }
}
