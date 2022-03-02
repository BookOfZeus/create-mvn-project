package ${package}.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Validation Exception
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidationException extends RuntimeException {

    /**
     * Constructor
     *
     * @param message The message
     */
    public ValidationException(String message) {
        super(message);
    }
}