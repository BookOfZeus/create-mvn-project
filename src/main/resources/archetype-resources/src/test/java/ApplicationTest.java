package ${package};

import org.junit.jupiter.api.Test;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestPropertySource(locations={"classpath:application-test.properties"})
class ApplicationTest {

    @Test
    void main() {
        assertTrue(true);
    }

    @Test
    void beforeStart() {
        new Application().initAfterStartup();
    }

    @Test
    void exit() {
        new Application().cleanupBeforeExit();
    }
}