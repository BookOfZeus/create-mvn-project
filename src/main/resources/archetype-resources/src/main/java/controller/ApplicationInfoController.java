package ${package}.controller;

import ${package}.service.ApplicationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Application Info Controller
 */
@RestController
public class ApplicationInfoController {

    /**
     * The application info service
     */
    private final ApplicationInfoService service;

    /**
     * Constructor
     */
    @Autowired
    public ApplicationInfoController(ApplicationInfoService service) {
        this.service = service;
    }

    /**
     * Get the application information.
     *
     * This will provide the following information:
     * - version
     * - group id
     * - artifact id
     * - timestamp
     *
     * @return The information about the application
     */
    @GetMapping(
            value = "/info",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> get() {
        return new ResponseEntity<>(
                service.get(),
                HttpStatus.OK
        );
    }
}