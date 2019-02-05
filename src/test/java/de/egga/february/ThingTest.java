package de.egga.february;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FiveTest {

    @Test
    void it_should_call_for_action() {

        String value = "Done";
        assertThat(value).isEqualTo("Done");
    }
}
