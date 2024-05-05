package lab4.ru.billing.exceptions;

public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException() {
        super();
    }

    public ItemAlreadyExistsException(String message) {
        super(message);
    }

    public ItemAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
