package com.example.kursach2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class AmountOutOfCollectionBoundException extends RuntimeException {
    public AmountOutOfCollectionBoundException() {
    }

    public AmountOutOfCollectionBoundException(String message) {
        super(message);
    }

    public AmountOutOfCollectionBoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmountOutOfCollectionBoundException(Throwable cause) {
        super(cause);
    }

    public AmountOutOfCollectionBoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}