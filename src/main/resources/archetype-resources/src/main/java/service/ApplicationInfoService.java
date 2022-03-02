package ${package}.service;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Service;

/**
 * Application Info Service
 */
@Service
public class ApplicationInfoService {

    /**
     * The build properties
     */
    private final BuildProperties properties;

    /**
     * Constructor
     *
     * @param properties The build properties
     */
    @Autowired
    public ApplicationInfoService(BuildProperties properties) {
        this.properties = properties;
    }

    /**
     * Get the application properties
     * @return The information about the application
     */
    public String get() {
        return new Gson().toJson(properties);
    }
}