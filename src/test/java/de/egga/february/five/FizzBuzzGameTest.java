package de.egga.february.five;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzGameTest {

    @Test
    void it_should_return_number_unaltered() {

        FizzBuzzGame game = new FizzBuzzGame();
        String answer = game.answer(1);
        assertThat(answer).isEqualTo("1");
    }

    @Test
    void it_should_return_number_unaltered2() {

        FizzBuzzGame game = new FizzBuzzGame();
        String answer = game.answer(2);
        assertThat(answer).isEqualTo("2");
    }
}
