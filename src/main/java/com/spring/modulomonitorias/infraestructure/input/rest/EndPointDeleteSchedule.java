package com.spring.modulomonitorias.infraestructure.input.rest;

import com.spring.modulomonitorias.application.handler.IScheduleHandler;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class EndPointDeleteSchedule {

    private final IScheduleHandler scheduleHandler;
    @Operation(summary = "Delete a schedule by its Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Schedule deleted", content = @Content),
            @ApiResponse(responseCode = "400", description = "Schedule not found", content = @Content)
    })

    @DeleteMapping("/{scheduleId}")
    public ResponseEntity<Void> deleteSchedule(@PathVariable Long scheduleId){
        scheduleHandler.deleteSchedule(scheduleId);
        return ResponseEntity.noContent().build();
    }
}
