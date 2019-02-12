package de.egga;

import static org.apache.commons.lang3.StringUtils.repeat;

class RomanNumeralConverter {

    String toRoman(int number) {

        if (number <= 3) {
            return repeat("I", number);

        }
        return "";
    }
}
