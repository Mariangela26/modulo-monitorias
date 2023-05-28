package com.spring.modulomonitorias.infraestructure.input.rest;

import com.spring.modulomonitorias.application.dto.InstructorRequest;
import com.spring.modulomonitorias.application.handler.IInstructorHandler;
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
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class EndPointPostInstructor {

    private final IInstructorHandler instructorHandler;

    @Operation(summary = "Add a new instructor")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Instructor created", content = @Content),
            @ApiResponse(responseCode = "409", description = "Instructor already exists", content = @Content)
    })
    @PostMapping("/")
    public ResponseEntity<Void> saveInstructor(@RequestBody InstructorRequest instructorRequest){
        instructorHandler.saveInstructor(instructorRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
