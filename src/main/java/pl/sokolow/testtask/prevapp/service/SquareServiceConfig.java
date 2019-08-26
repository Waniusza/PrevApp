package pl.sokolow.testtask.prevapp.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SquareServiceConfig {
    @Bean(initMethod = "init")
    public SquareService squareService() {
        return new SquareService();
    }
}