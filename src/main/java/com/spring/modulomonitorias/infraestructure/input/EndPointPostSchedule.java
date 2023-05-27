package com.spring.modulomonitorias.infraestructure.input;

import com.spring.modulomonitorias.application.dto.ScheduleRequest;
import com.spring.modulomonitorias.application.handler.IScheduleHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class EndPointPostSchedule {

    private final IScheduleHandler scheduleHandler;

    @Operation(summary = "Add a new schedule")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Schedule created", content = @Content),
            @ApiResponse(responseCode = "409", description = "Schedule already exists", content = @Content)
    })
    @PostMapping("/")
    public ResponseEntity<Void> saveSchedule(@RequestBody ScheduleRequest scheduleRequest){
        scheduleHandler.saveSchedule(scheduleRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
