package com.spring.modulomonitorias.infraestructure.input;

import com.spring.modulomonitorias.application.dto.ScheduleResponse;
import com.spring.modulomonitorias.application.handler.IScheduleHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class EndPointGetAllSchedule {

    private final IScheduleHandler scheduleHandler;

    @Operation(summary = "Get all the schedules")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All schedules returned",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = ScheduleResponse.class)))),
            @ApiResponse(responseCode = "404", description = "No data found", content = @Content)
    })
    @GetMapping("/")
    public ResponseEntity<List<ScheduleResponse>> getAllSchedule(){
        return ResponseEntity.ok(scheduleHandler.getAllSchedule());
    }
}
