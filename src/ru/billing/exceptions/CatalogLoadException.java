package ru.billing.exceptions;

public class CatalogLoadException extends Exception {
    public CatalogLoadException() {
        super();
    }

    public CatalogLoadException(String message) {
        super(message);
    }

    public CatalogLoadException(Throwable cause) {
        super(cause);
    }

    public CatalogLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
