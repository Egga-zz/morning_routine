package de.egga;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateProviderTest {

    @Test
    void asd() {
        DateProvider dateProvider = new DateProvider();
        LocalDate date = dateProvider.getCurrentDate();

    }
}
