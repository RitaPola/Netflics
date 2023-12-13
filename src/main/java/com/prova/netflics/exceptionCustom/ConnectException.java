package com.prova.netflics.exceptionCustom;

public class ConnectException extends RuntimeException{

    public ConnectException(String message){
        super(message);
    }
    public ConnectException(String message, Throwable cause){
        super(message,cause);
    }
    public ConnectException(Throwable cause){
        super(cause);
    }
}
