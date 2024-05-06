package com.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CompanyException extends CustomException{

    private String message;

    public CompanyException() {
    }

    public CompanyException(String message) {
        super(message);
        this.message = message;
    }

    public CompanyException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public CompanyException(Throwable cause) {
        super(cause);
    }

    @Override
    public int getStatusCode() {
        return HttpStatus.BAD_REQUEST.value();
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
