package de.egga.february.five;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzGameTest {

    @Test
    void it_should_call_for_action() {

        FizzBuzzGame game = new FizzBuzzGame();
        String answer = game.answer();
        assertThat(answer).isEqualTo("1");
    }
}
