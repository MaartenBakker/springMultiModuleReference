package org.example;

import org.example.Game;
import org.example.MessageGenerator;
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
    private void init() {
        log.info("game = {}", game);
    }

    // -- public Methods --
    @Override
    public String getMainMessage() {
        return "Number is between " +
                game.getSmallest() +
                " & " +
                game.getBiggest() +
                ". Can you guess it?";
    }

    @Override
    public String getResultMessage() {

        if(game.isGameWon()) {
            return "You guessed it! The number was: " + game.getNumber();
        } else if(game.isGameLost()) {
            return "You lost! The number was: " + game.getNumber();
        } else if(!game.isValidNumberRange()) {
            return "Invalid number range!";
        } else if(game.getRemainingGuesses() == guessCount) {
            return "What is your first guess?";
        } else {
            String direction = game.getGuess() < game.getNumber() ? "Higher" : "Lower";

            return direction + "! You have " + game.getRemainingGuesses() + " guesses left.";
        }
    }
}
