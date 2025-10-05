package dev.himbra.taskmanagerapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public AuditorAware<String> auditorProvider() {
        return ()-> Optional.of("system"); // TODO: replace "system" with the current logged in user
    }
}
