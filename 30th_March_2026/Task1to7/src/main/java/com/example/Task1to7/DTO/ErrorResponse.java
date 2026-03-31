package com.example.Task1to7.DTO;

import lombok.Getter;

import java.time.Instant;

@Getter
public class ErrorResponse {

//    private long timeStamp;
    Instant timeStamp = Instant.now();
    private int status;
    private String message;

//    public ErrorResponse(long timeStamp, int status, String message) {
//        this.timeStamp = timeStamp;
//        this.status = status;
//        this.message = message;
//    }

    public ErrorResponse(Instant timeStamp, int status, String message) {
        this.timeStamp = timeStamp;
        this.status = status;
        this.message = message;
    }
}
