package ${package}.config;

import ${package}.exception.AccessDeniedException;
import ${package}.exception.NotFoundException;
import ${package}.exception.ValidationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.*;

class ControllerAdviceConfigTest {

    private ControllerAdviceConfig controllerAdviceConfig;

    @BeforeEach
    void setUp() {
        controllerAdviceConfig = new ControllerAdviceConfig();
    }

    @Test
    void handleAllExceptions() {
        ResponseEntity<?> response = controllerAdviceConfig.handleAllExceptions(
                new Exception("ERR")
        );
        assertEquals(
                500,
                response.getStatusCode().value()
        );
    }

    @Test
    void handleConstraintViolationException() {
        ResponseEntity<?> response = controllerAdviceConfig.handleConstraintViolationException(
                new ConstraintViolationException("ERR", null)
        );
        assertEquals(
                400,
                response.getStatusCode().value()
        );
    }

    @Test
    void handleUnauthorized() {
        ResponseEntity<?> response = controllerAdviceConfig.handleUnauthorized(
                new AccessDeniedException("ERR")
        );
        assertEquals(
                401,
                response.getStatusCode().value()
        );
    }

    @Test
    void handleNotFoundException() {
        ResponseEntity<?> response = controllerAdviceConfig.handleNotFoundException(
                new NotFoundException("ERR")
        );
        assertEquals(
                404,
                response.getStatusCode().value()
        );
    }

    @Test
    void handleValidationException() {
        ResponseEntity<?> response = controllerAdviceConfig.handleValidationException(
                new ValidationException("ERR")
        );
        assertEquals(
                400,
                response.getStatusCode().value()
        );
    }
}