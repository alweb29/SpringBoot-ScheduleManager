package com.alweb29.schedulemanager.month.rest;

public class MonthNotFoundException extends RuntimeException{

    public MonthNotFoundException(String message) {
        super(message);
    }

    public MonthNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MonthNotFoundException(Throwable cause) {
        super(cause);
    }
}
