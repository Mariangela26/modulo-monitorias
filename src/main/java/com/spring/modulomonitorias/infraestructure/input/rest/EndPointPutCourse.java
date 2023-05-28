package com.spring.modulomonitorias.infraestructure.input.rest;

import com.spring.modulomonitorias.application.dto.CourseRequest;
import com.spring.modulomonitorias.application.handler.ICourseHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class EndPointPutCourse {

    private final ICourseHandler courseHandler;

    @Operation(summary = "Update an existing course")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Course updated", content = @Content),
            @ApiResponse(responseCode = "404", description = "Course not found", content = @Content)
    })
    @PutMapping("/{courseId}")
    public ResponseEntity<Void> updateCourse(@RequestBody CourseRequest courseRequest,
                                           @Parameter(description = "Id of the course to be modified")
                                           @PathVariable(name = "courseId")Long courseId){
        courseHandler.updateCourse(courseRequest, courseId);
        return ResponseEntity.noContent().build();
    }
}
