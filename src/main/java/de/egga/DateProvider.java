package de.egga;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;

class DateProvider {

    private DateTimeFormatter formatter = ofPattern("dd.MM.yyyy");

    String getCurrentDateAsString() {
        return getCurrentDate().format(formatter);
    }

    private LocalDate getCurrentDate() {

        return LocalDate.now();
    }
}
