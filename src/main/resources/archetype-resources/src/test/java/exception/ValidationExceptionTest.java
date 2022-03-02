package ${package}.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationExceptionTest {
    @Test
    void willFail() {
        assertThrows(
                ValidationException.class,
                () -> { throw new ValidationException("error"); }
        );
    }
}