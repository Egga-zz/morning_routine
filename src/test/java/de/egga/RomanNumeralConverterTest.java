package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanNumeralConverterTest {

    RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    void it_should_convert_one() {
        String result = converter.toRoman(1);
        assertThat(result).isEqualTo("I");
    }
    @Test
    void it_should_convert_two() {
        String result = converter.toRoman(2);
        assertThat(result).isEqualTo("II");
    }

    @Test
    void it_should_convert_three() {
        String result = converter.toRoman(3);
        assertThat(result).isEqualTo("III");
    }

    @Test
    void it_should_return_empty_string_on_zero_as_romans_had_a_very_limited_understanding_of_numerals() {
        String result = converter.toRoman(0);
        assertThat(result).isEqualTo("");
    }

}
