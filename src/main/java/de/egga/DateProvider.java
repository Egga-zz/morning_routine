package de.egga;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateProvider {

    LocalDate getCurrentDate() {

        return LocalDate.now();
    }

    public String getCurrentDateAsString() {
        String formattedDate = getCurrentDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return formattedDate;
    }
}
