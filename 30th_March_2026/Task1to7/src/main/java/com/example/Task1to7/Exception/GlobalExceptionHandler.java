package com.example.Task1to7.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.Task1to7.DTO.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<String> handleRuntimeException(RuntimeException re) {
//        return new ResponseEntity<>("Error: " + re.getMessage(), HttpStatus.BAD_REQUEST);
//    }

//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException re) {
//        return new ResponseEntity<>(
//                new ErrorResponse(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), re.getMessage()), HttpStatus.NOT_FOUND
//        );
//    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException re) {
        return new ResponseEntity<>(
                new ErrorResponse(Instant.now(), HttpStatus.NOT_FOUND.value(), re.getMessage()), HttpStatus.NOT_FOUND
        );
    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<ErrorResponse> handleMethodArgumentException(MethodArgumentNotValidException me) {
//        return new ResponseEntity<>(
//                new ErrorResponse(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(), me.getMessage()), HttpStatus.BAD_REQUEST
//        );
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleMethodArgumentException(MethodArgumentNotValidException me) {
        return new ResponseEntity<>(
                new ErrorResponse(Instant.now(), HttpStatus.BAD_REQUEST.value(), me.getMessage()), HttpStatus.BAD_REQUEST
        );
    }

//    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
//    public ResponseEntity<ErrorResponse> handleMethodArgument(MethodArgumentTypeMismatchException me) {
//        return new ResponseEntity<>(
//                new ErrorResponse(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(), me.getMessage()), HttpStatus.BAD_REQUEST
//        );
//    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorResponse> handleMethodArgument(MethodArgumentTypeMismatchException me) {
        return new ResponseEntity<>(
                new ErrorResponse(Instant.now(), HttpStatus.BAD_REQUEST.value(), me.getMessage()), HttpStatus.BAD_REQUEST
        );
    }



}