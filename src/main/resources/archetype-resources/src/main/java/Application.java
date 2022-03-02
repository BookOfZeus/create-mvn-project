package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * The application
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

    /**
     * Init
     */
    @PostConstruct
    public void initAfterStartup() {
        //
    }

    /**
     * Pre terminate method
     */
    @PreDestroy
    public void cleanupBeforeExit() {
        // Log - LocaleFactory.join("app.close", "Clean exit")
    }

    /**
     * Main()
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        // Validate environment variables
    }
}