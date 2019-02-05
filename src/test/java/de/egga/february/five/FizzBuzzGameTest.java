package de.egga.february.five;

import org.junit.jupiter.api.Test;

class FizzBuzzGameTest {

    @Test
    void it_should_call_for_action() {

        FizzBuzzGame game = new FizzBuzzGame();
        String answer = game.answer();
    }
}
