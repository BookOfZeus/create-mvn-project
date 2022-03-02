package ${package}.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Access Denied Exception
 */
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class AccessDeniedException extends RuntimeException {

    /**
     * Constructor
     *
     * @param message The message
     */
    public AccessDeniedException(String message) {
        super(message);
    }
}