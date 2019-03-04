package de.egga;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Game implements BowlingGameCalculator {

    @Override
    public Integer calculateScore(String scoreCard) {

        List<Frame> frames = parseFrames(scoreCard);
        return countScoreOfFrames(frames);
    }

    private int countScoreOfFrames(List<Frame> frames) {
        int sum = 0;
        for (Frame frame : frames) {
            sum += frame.getNumberOfPinsKnockedDown();
        }
        return sum;
    }

    private List<Frame> parseFrames(String scoreCard) {
        List<Frame> frames = new ArrayList<>();

        Integer firstRollInFrame = null;
        for (String currentRoll : scoreCard.split("")) {

            int currentScore = parseInt(currentRoll);

            if (firstRollInFrame == null) {
                firstRollInFrame = currentScore;

            } else {
                frames.add(new Frame(firstRollInFrame, currentScore));
                firstRollInFrame = null;
            }
        }
        return frames;
    }
}
