package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DateProviderTest {

    @Test
    void it_should_return_formatted_string() {
        DateProvider dateProvider = new DateProvider();
        String date = dateProvider.getCurrentDateAsString();
        assertThat(date).isEqualTo("22.02.2019");
    }
}
