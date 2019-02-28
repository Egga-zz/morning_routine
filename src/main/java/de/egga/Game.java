package de.egga;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.asList;

public class Game implements BowlingGameCalculator {

    @Override
    public Integer calculateScore(String scoreCard) {

        int score = 0;

        for (List<String> frame : method(scoreCard)) {

            for (String roll : frame) {

                if (roll.equals("/")) {
                    score += 10 - parseInt(frame.get(0));

                } else {
                    score += parseInt(roll);
                }
            }
        }

        return score;
    }

    private List<List<String>> method(String scoreCard) {

        List<List<String>> frames = new ArrayList<>();
        String lastRollInFrame = null;

        for (String roll : scoreCard.split("")) {

            if (lastRollInFrame == null) {
                lastRollInFrame = roll;

            } else {
                frames.add(asList(lastRollInFrame, roll));
                lastRollInFrame = null;
            }
        }

        return frames;
    }
}
