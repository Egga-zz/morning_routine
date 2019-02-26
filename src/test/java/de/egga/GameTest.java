package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    Game game = new Game();

    @Test
    void it_should_count_number_of_pins_on_single_roll() {
        Integer score = game.calculateScore("2");
        assertThat(score).isEqualTo(2);
    }

    @Test
    void it_should_add_number_of_pins_on_two_rolls() {
        Integer score = game.calculateScore("23");
        assertThat(score).isEqualTo(5);
    }

    @Test
    void it_should_add_number_of_pins_on_spare() {
        Integer score = game.calculateScore("2/");
        assertThat(score).isEqualTo(10);
    }
}
