package de.egga;

import static java.lang.Integer.parseInt;

public class Game implements BowlingGameCalculator {

    @Override
    public Integer calculateScore(String scoreCard) {

        String[] rolls = scoreCard.split("");

        return countPinsOf(rolls);
    }

    private int countPinsOf(String[] rolls) {

        Integer pinsKnockedDownInFrame = null;

        int sum = 0;
        for (String roll : rolls) {

            int pinsKnockedDownInRoll = 0;
            if (roll.equals("/")) {
                pinsKnockedDownInRoll = 10 - pinsKnockedDownInFrame;
            } else {
                pinsKnockedDownInRoll = parseInt(roll);
            }

            if (pinsKnockedDownInFrame == null) {
                pinsKnockedDownInFrame = pinsKnockedDownInRoll;
            } else {
                pinsKnockedDownInFrame = null;
            }

            sum += pinsKnockedDownInRoll;
        }
        return sum;
    }
}
