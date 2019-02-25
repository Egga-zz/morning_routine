package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    void it_should_return_number_of_pins_after_first_throw() {
        Game game = new Game();
        Integer score = game.calculateScore("2");
        assertThat(score).isEqualTo(2);
    }

    @Test
    void it_should_return_number_of_pins_after_second_throw() {
        Game game = new Game();
        Integer score = game.calculateScore("23");
        assertThat(score).isEqualTo(5);
    }
}
