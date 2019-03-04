package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    Game game = new Game();

    @Test
    void it_should_add_up_number_of_pins_knocked_down() {
        Integer score = game.calculateScore("43");
        assertThat(score).isEqualTo(7);
    }
}
