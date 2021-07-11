package guru.springframework.sfgpetclinic.controllers;

/**
 * @author Ehsan Rostami Pour
 * @version 1.0
 * @date 7/11/2021 5:39 PM
 */
public class ValueNotFoundException extends RuntimeException {

    public ValueNotFoundException() {
    }

    public ValueNotFoundException(String message) {
        super(message);
    }

    public ValueNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValueNotFoundException(Throwable cause) {
        super(cause);
    }

    public ValueNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
