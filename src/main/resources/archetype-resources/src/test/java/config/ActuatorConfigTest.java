package ${package}.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestPropertySource(locations={"classpath:application-test.properties"})
class ActuatorConfigTest {

    @SuppressWarnings("unused")
    @Autowired
    private ActuatorConfig config;

    @Test
    void constructor() {
        new ActuatorConfig();
        assertTrue(true);
    }

    @Test
    void configure() {
        // will automatically load
        assertTrue(true);
    }
}