package com.spring.modulomonitorias.infraestructure.input;

import com.spring.modulomonitorias.application.dto.InstructorResponse;
import com.spring.modulomonitorias.application.handler.IInstructorHandler;
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
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class EndPointGetAllInstructor {

    private final IInstructorHandler instructorHandler;

    @Operation(summary = "Get all the instructors")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All instructors returned",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = InstructorResponse.class)))),
            @ApiResponse(responseCode = "404", description = "No data found", content = @Content)
    })
    @GetMapping("/")
    public ResponseEntity<List<InstructorResponse>> getAllInstructor(){
        return ResponseEntity.ok(instructorHandler.getAllInstructor());
    }
}
