package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralConverterTest {

    @Test
    void it_should_convert_one() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.toRoman(1);
        assertThat(result).isEqualTo("I");
    }
}
