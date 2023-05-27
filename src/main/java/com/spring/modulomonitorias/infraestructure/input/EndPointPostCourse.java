package com.spring.modulomonitorias.infraestructure.input;

import com.spring.modulomonitorias.application.dto.CourseRequest;
import com.spring.modulomonitorias.application.handler.ICourseHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class EndPointPostCourse {

    private final ICourseHandler courseHandler;

    @Operation(summary = "Add a new course")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Course created", content = @Content),
            @ApiResponse(responseCode = "409", description = "Course already exists", content = @Content)
    })
    @PostMapping("/")
    public ResponseEntity<Void> saveCourse(@RequestBody CourseRequest courseRequest){
        courseHandler.saveCourse(courseRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
