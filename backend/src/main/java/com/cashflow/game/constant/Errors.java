package com.cashflow.game.constant;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public abstract class Errors {

    @ResponseStatus(value = HttpStatus.PRECONDITION_FAILED, reason = "Game still initializing")
    public static class GameNotInitializedException extends RuntimeException {
    }

    @ResponseStatus(value = HttpStatus.GONE, reason = "Wrong endpoint hit")
    public static class WrongEndpointException extends RuntimeException {
    }
}
