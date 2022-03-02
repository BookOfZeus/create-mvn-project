package ${package}.config;

import ${package}.exception.AccessDeniedException;
import ${package}.exception.NotFoundException;
import ${package}.exception.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;

/**
 * Controller Exception
 *
 * @since ${version}
 */
@ControllerAdvice
public class ControllerAdviceConfig {

    /**
     * Handle all exceptions
     * @param ex The exception
     * @return ResponseEntity
     */
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex) {
        // TODO Log.err(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Handle all constraint validations
     * @param ex The exception
     * @return ResponseEntity
     */
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException ex) {
        // TODO Log.err(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    /**
     * Handle all Access Denied Exception
     * @param ex The exception
     * @return ResponseEntity
     */
    @ExceptionHandler(AccessDeniedException.class)
    public final ResponseEntity<Object> handleUnauthorized(AccessDeniedException ex) {
        // TODO Log.err(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    /**
     * Handle all Missing Request Header Exception
     * @param ex The exception
     * @return ResponseEntity
     */
    @ExceptionHandler(MissingRequestHeaderException.class)
    public final ResponseEntity<Object> handleMissingRequestHeader(MissingRequestHeaderException ex) {
        // TODO Log.err(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    /**
     * Handle all Not Found Exception
     * @param ex The exception
     * @return ResponseEntity
     */
    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<Object> handleNotFoundException(NotFoundException ex) {
        // TODO Log.err(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    /**
     * Handle all Validation Exception
     * @param ex The exception
     * @return ResponseEntity
     */
    @ExceptionHandler(ValidationException.class)
    public final ResponseEntity<Object> handleValidationException(ValidationException ex) {
        // TODO Log.err(ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}