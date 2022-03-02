package ${package}.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccessDeniedExceptionTest {

    @Test
    void willFail() {
        assertThrows(
                AccessDeniedException.class,
                () -> { throw new AccessDeniedException("error"); }
        );
    }
}