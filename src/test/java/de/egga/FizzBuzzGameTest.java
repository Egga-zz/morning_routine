package de.egga;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzGameTest {


    FizzBuzz game = new FizzBuzz();


    @Test
    void it_should_return_unaltered_number() {

        assertThat(game.answer(1)).isEqualTo("1");
    
        assertThat(game.answer(2)).isEqualTo("2");
    }

    @Test
    void it_should_return_fizz_on_multiples_of_three() {

        assertThat(game.answer(3)).isEqualTo("fizz");

        assertThat(game.answer(6)).isEqualTo("fizz");
    }

    @Test
    void it_should_return_buzz_on_multiples_of_five() {

        assertThat(game.answer(5)).isEqualTo("buzz");

        assertThat(game.answer(10)).isEqualTo("buzz");
    }

}
