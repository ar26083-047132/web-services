package com.example.demo.services.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class ServiceNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public ServiceNotFoundException(String cause) {
        super("No such services with " + cause);
    }

}
