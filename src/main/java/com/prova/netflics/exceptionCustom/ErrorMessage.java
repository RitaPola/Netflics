package com.prova.netflics.exceptionCustom;

import lombok.Builder;
import lombok.Data;


import java.sql.Timestamp;
import java.time.Instant;

@Data
public class ErrorMessage {
    private int status;
    private String error;
    private String message;
    private Timestamp timeStamp;

    @Builder
    public ErrorMessage(int status, String error, String message, Timestamp timeStamp) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.timeStamp = timeStamp != null ? timeStamp : Timestamp.from(Instant.now());
    }
}
