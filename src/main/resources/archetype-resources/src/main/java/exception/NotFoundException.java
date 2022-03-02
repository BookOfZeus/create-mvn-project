package ${package}.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Not Found Exception
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    /**
     * Constructor
     *
     * @param message The message
     */
    public NotFoundException(String message) {
        super(message);
    }
}