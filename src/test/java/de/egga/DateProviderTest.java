package de.egga;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

public class DateProviderTest {

    @Test
    void asd() {
        DateProvider dateProvider = new DateProvider();
        LocalDate date = dateProvider.getCurrentDate();
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        assertThat(formattedDate).isEqualTo("22.02.2019");
    }

    @Test
    void formatted() {
        DateProvider dateProvider = new DateProvider();
        String date = dateProvider.getCurrentDateAsString();
        assertThat(date).isEqualTo("22.02.2019");
    }
}
