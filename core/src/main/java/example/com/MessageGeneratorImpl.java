package example.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    // -- Contants --

    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    // -- Fields --
    @Autowired
    private Game game;
    private int guessCount= 10;

    // -- Init --
    @PostConstruct
    private void initMessage() {
        log.info("The guess count = " + String.valueOf(guessCount));
    }

    // -- public Methods --

    @Override
    public String getMainMessage() {
        return "This is the result of getMainMessage()";
    }

    @Override
    public String getResultMessage() {
        return "This is the result of getResultMessage()";
    }
}
