package de.egga;

import static java.lang.Integer.parseInt;

public class Game implements BowlingGameCalculator {

    @Override
    public Integer calculateScore(String scoreCard) {

        String[] characters = scoreCard.split("");

        return calculateSumOfThrows(characters);
    }

    private int calculateSumOfThrows(String[] characters) {
        int sum = 0;

        for (String character :characters){
            sum += parseInt(character);
        }

        return sum;
    }
}
