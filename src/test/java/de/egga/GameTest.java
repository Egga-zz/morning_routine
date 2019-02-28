package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    Game game = new Game();

    @Test
    void it_should_add_number_of_knocked_down_pins() {
        Integer score = game.calculateScore("34");
        assertThat(score).isEqualTo(7);
    }

    @Test
    void it_should_count_number_of_pins_on_spare() {
        Integer score = game.calculateScore("3/");
        assertThat(score).isEqualTo(10);
    }
}
