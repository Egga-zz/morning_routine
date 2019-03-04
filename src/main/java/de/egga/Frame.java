package de.egga;

public class Frame {

    private final Integer firstRoll;
    private final Integer secondRoll;

    Frame(Integer firstRoll, Integer secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }

    Integer getNumberOfPinsKnockedDown() {
        return firstRoll + secondRoll;
    }
}
