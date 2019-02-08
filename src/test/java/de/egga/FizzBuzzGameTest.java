package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzGameTest {


    @Test
    void it_should_return_unaltered_number() {

        FizzBuzz game = new FizzBuzz();

        String answer = game.answer(1);

        assertThat(answer).isEqualTo("1");
    }

    @Test
    void it_should_return_another_unaltered_number() {

        FizzBuzz game = new FizzBuzz();

        String answer = game.answer(2);

        assertThat(answer).isEqualTo("2");
    }
}
