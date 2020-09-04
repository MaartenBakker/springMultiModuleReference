package org.example.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ConsoleNumberGuess {

    // -- Constants --
    private final static Logger log = LoggerFactory.getLogger(ConsoleNumberGuess.class);

    // -- public Methods --
    @EventListener(ContextRefreshedEvent.class)
    public void start() {
        log.info("Start() --> Container ready for use");
    }
}

