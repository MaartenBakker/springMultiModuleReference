package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;


public class NumberGeneratorImpl implements NumberGenerator {

    // -- Fields --
    private final Random random = new Random();

    @Autowired
    @MaxNumber
    private int maxNumber;

    @Autowired
    @MinNumber
    private int minNumber;

    // -- Public Methods --
    @Override
    public int next() {
        int number = random.nextInt(maxNumber-minNumber);
        number = number + minNumber;
        return number;
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }

    @Override
    public int getMinNumber() {
        return minNumber;
    }
}
