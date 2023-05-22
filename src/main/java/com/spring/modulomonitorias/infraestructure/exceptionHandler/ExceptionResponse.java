package com.spring.modulomonitorias.infraestructure.exceptionHandler;

public enum ExceptionResponse {
    ELEMENT_NOT_FOUND("No Element was found with that number"),
    ELEMENT_ALREADY_EXISTS("There is already a Element with that number"),
    NO_DATA_FOUND("No data found for the requested petition");

    private String mesage;

    ExceptionResponse(String mesage){
        this.mesage = mesage;
    }
    public String getMessage(){
        return this.mesage;
    }

}
