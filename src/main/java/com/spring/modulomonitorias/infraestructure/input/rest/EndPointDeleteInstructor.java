package com.spring.modulomonitorias.infraestructure.input.rest;

import com.spring.modulomonitorias.application.handler.IInstructorHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class EndPointDeleteInstructor {

    private final IInstructorHandler instructorHandler;

    @Operation(summary = "Delete a instructor by its Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Instructor deleted", content = @Content),
            @ApiResponse(responseCode = "400", description = "Instructor not found", content = @Content)
    })

    @DeleteMapping("/{instructorId}")
    public ResponseEntity<Void> deleteInstructor(@PathVariable Long instructorId){
        instructorHandler.deleteInstructor(instructorId);
        return ResponseEntity.noContent().build();
    }
}

