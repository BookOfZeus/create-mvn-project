package ${package}.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotFoundExceptionTest {
    @Test
    void willFail() {
        assertThrows(
                NotFoundException.class,
                () -> { throw new NotFoundException("error"); }
        );
    }
}