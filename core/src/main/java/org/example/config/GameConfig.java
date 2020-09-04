package org.example.config;

import org.example.GuessCount;
import org.example.MaxNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // -- Fields --
    @Value("${game.maxNumber:50}") // achter : is default
    private int maxNumber;
    @Value("${game.guessCount:5}")
    private int guessCount;

    // -- Bean Methods --
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
}
