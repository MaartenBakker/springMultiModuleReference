package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator {

    // -- Fields --
    private final Random random = new Random();

    private final int maxNumber;

    private final int minNumber;

    // - constructors --
    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

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
