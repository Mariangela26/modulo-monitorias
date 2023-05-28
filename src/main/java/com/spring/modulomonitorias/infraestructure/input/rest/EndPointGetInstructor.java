package com.spring.modulomonitorias.infraestructure.input.rest;

import com.spring.modulomonitorias.application.dto.InstructorResponse;
import com.spring.modulomonitorias.application.handler.IInstructorHandler;
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
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class EndPointGetInstructor {

    private final IInstructorHandler instructorHandler;

    @Operation(summary = "Get a instructor by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Instructor found",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = InstructorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Instructor not found", content = @Content)
    })
    @GetMapping("/{instructorId}")
    public ResponseEntity<InstructorResponse> getInstructor(@Parameter(description = "Id of the instructor to be returned")
                                                    @PathVariable(name = "instructorId") Long instructorId){
        return ResponseEntity.ok(instructorHandler.getInstructor(instructorId));
    }
}
