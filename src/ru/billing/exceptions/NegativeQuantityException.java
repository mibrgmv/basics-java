package ru.billing.exceptions;

public class NegativeQuantityException extends Exception {
    public NegativeQuantityException() {
        super();
    }

    public NegativeQuantityException(String message) {
        super(message);
    }

    public NegativeQuantityException(String message, Throwable cause) {
        super(message, cause);
    }
}
