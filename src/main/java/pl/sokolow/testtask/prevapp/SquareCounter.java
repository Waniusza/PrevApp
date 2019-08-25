package pl.sokolow.testtask.prevapp;

import java.util.Optional;

public class SquareCounter {

    public static Optional<Double> count(Double side)  throws IllegalArgumentException {
        if (side <= 0) 
            throw new IllegalArgumentException("Value of side have to be positive"); 
        Optional<Double> result = Optional.ofNullable(Math.pow(side, 2));
        return result;
    }
}