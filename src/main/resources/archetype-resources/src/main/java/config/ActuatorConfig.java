package ${package}.config;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.boot.actuate.context.ShutdownEndpoint;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Actuator Security Config
 *
 * @since ${version}
 */
@Configuration
@EnableWebSecurity
public class ActuatorConfig extends WebSecurityConfigurerAdapter {

    /**
     * Spring security configuration
     *
     * <p>
     *     Restrict access to the Shutdown endpoint to the ACTUATOR_ADMIN role.
     *     Allow access to all other actuator endpoints.
     * </p>
     * @param http The HttpSecurity
     * @throws Exception Will throw an exception in case of http error
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .requestMatchers(EndpointRequest.to(ShutdownEndpoint.class))
                .hasRole("ACTUATOR_ADMIN")
                .requestMatchers(EndpointRequest.toAnyEndpoint())
                .permitAll()
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations())
                .permitAll()
                .antMatchers("/**")
                .permitAll()
                .and()
                .httpBasic();

        http.csrf().disable();

    }
}
