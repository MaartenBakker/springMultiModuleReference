package example.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "example.com")
public class AppConfig {

    // -- bean methods --
    @Bean
    public NumberGenerator numberGenerator() {
        return new NumberGeneratorImpl();
    }

    @Bean Game game() {
        return new GameImpl();
    }

    @Bean MessageGenerator messageGenerator() {
        return new MessageGeneratorImpl();
    }

}
