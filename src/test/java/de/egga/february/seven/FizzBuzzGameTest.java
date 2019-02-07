package de.egga.february.seven;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzGameTest {

    FizzBuzz game = new FizzBuzz();

    @Test
    void it_should_return_number_unaltered() {
        assertThat(game.answer(1)).isEqualTo("1");
        assertThat(game.answer(2)).isEqualTo("2");
    }

    @Test
    void it_should_return_fizz_for_multiples_of_three() {
        assertThat(game.answer(3)).isEqualTo("fizz");
        assertThat(game.answer(6)).isEqualTo("fizz");
    }

    @Test
    void it_should_return_buzz_for_multiples_of_five() {
        assertThat(game.answer(5)).isEqualTo("buzz");
        assertThat(game.answer(10)).isEqualTo("buzz");
    }

    @Test
    void it_should_return_fizzbuzz_for_multiples_of_fifteen() {
        assertThat(game.answer(15)).isEqualTo("fizzbuzz");
        assertThat(game.answer(300)).isEqualTo("fizzbuzz");
    }
}
