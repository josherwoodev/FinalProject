package com.cashflow.game.constant;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public abstract class Errors {

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such resource by given id exists")
    public static class ResourceNotFoundException extends RuntimeException {
    }

//    @ResponseStatus(value = Htt)
}
