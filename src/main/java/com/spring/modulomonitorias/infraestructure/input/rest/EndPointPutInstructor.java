package com.spring.modulomonitorias.infraestructure.input.rest;

import com.spring.modulomonitorias.application.dto.InstructorRequest;
import com.spring.modulomonitorias.application.handler.IInstructorHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class EndPointPutInstructor {

    private final IInstructorHandler instructorHandler;

    @Operation(summary = "Update an existing instructor")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Instructor updated", content = @Content),
            @ApiResponse(responseCode = "404", description = "Instructor not found", content = @Content)
    })
    @PutMapping("/{instructorId}")
    public ResponseEntity<Void> updateInstructor(@RequestBody InstructorRequest instructorRequest,
                                           @Parameter(description = "Id of the instructor to be modified")
                                           @PathVariable(name = "instructorId")Long instructorId){
        instructorHandler.updateInstructor(instructorRequest, instructorId);
        return ResponseEntity.noContent().build();
    }
}
