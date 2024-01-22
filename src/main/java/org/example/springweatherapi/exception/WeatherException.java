package org.example.springweatherapi.exception;

public class WeatherException {
    private final String message;
    private final Throwable throwable;
    private final org.springframework.http.HttpStatus HttpStatus;

    public WeatherException(String message, Throwable throwable, org.springframework.http.HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        HttpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public org.springframework.http.HttpStatus getHttpStatus() {
        return HttpStatus;
    }
}



