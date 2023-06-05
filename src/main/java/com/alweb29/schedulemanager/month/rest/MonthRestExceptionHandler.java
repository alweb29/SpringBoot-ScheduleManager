package com.alweb29.schedulemanager.month.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MonthRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<MonthErrorResponse> handleException (MonthNotFoundException exc){
        MonthErrorResponse monthErrorResponse = new MonthErrorResponse();
        monthErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        monthErrorResponse.setMessage(exc.getMessage());
        monthErrorResponse.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(monthErrorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<MonthErrorResponse> handleException (Exception exc){
        MonthErrorResponse monthErrorResponse = new MonthErrorResponse();
        monthErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        monthErrorResponse.setMessage(exc.getMessage());
        monthErrorResponse.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(monthErrorResponse, HttpStatus.BAD_REQUEST);
    }

}
