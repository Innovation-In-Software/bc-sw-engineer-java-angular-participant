package com.academy.atm;

public class InvalidPinException extends Exception {

    private final int attemptsRemaining;

    public InvalidPinException(String message, int attemptsRemaining) {
        super(message);
        this.attemptsRemaining = attemptsRemaining;
    }

    public int getAttemptsRemaining() {
        return attemptsRemaining;
    }
}
