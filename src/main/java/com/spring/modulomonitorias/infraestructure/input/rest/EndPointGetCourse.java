package com.spring.modulomonitorias.infraestructure.input.rest;

import com.spring.modulomonitorias.application.dto.CourseResponse;
import com.spring.modulomonitorias.application.handler.ICourseHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class EndPointGetCourse {

    private final ICourseHandler courseHandler;

    @Operation(summary = "Get a course by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Course found",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = CourseResponse.class))),
            @ApiResponse(responseCode = "404", description = "Course not found", content = @Content)
    })
    @GetMapping("/{courseId}")
    public ResponseEntity<CourseResponse> getCourse(@Parameter(description = "Id of the course to be returned")
                                                             @PathVariable(name = "courseId") Long courseId){
        return ResponseEntity.ok(courseHandler.getCourse(courseId));
    }
}
