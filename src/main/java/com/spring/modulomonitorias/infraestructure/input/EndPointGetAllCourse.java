package com.spring.modulomonitorias.infraestructure.input;

import com.spring.modulomonitorias.application.dto.CourseResponse;
import com.spring.modulomonitorias.application.handler.ICourseHandler;
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
@RequestMapping("/course")
@RequiredArgsConstructor
public class EndPointGetAllCourse {

    private final ICourseHandler courseHandler;
    @Operation(summary = "Get all the schedules")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All schedules returned",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = CourseResponse.class)))),
            @ApiResponse(responseCode = "404", description = "No data found", content = @Content)
    })
    @GetMapping("/")
    public ResponseEntity<List<CourseResponse>> getAllCourse(){
        return ResponseEntity.ok(courseHandler.getAllCourse());
    }
}
