package org.example.console;

import org.example.AppConfig;
import org.example.Game;
import org.example.MessageGenerator;
import org.example.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // create context (container)
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        //get numberGenerator bean from context (container)
//        NumberGenerator numberGenerator
//                = context.getBean(NumberGenerator.class); // overloaded, also
//            // works without "numberGenerator"
//
//        // call method next() to get a random number
//        int number = numberGenerator.next();
//
//        // log generated number
//        log.info("number = {}", number);
//
//        // get game bean from context (container)
//        Game game = context.getBean(Game.class);

        // get messageGenerator bean from context

        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
        log.info(messageGenerator.getMainMessage());
        log.info(messageGenerator.getResultMessage());


        // close context (container)
        context.close();
    }
}
