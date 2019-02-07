package de.egga.february.seven;

class FizzBuzz {

    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";

    String answer(Integer number) {

        if (isMultipleOfThree(number) && isMultipleOfFive(number)) {
            return FIZZ + BUZZ;
        }

        if (isMultipleOfThree(number)) {
            return FIZZ;
        }
        if (isMultipleOfFive(number)) {
            return BUZZ;
        }
        return number.toString();
    }

    private boolean isMultipleOfThree(Integer number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOfFive(Integer number) {
        return number % 5 == 0;
    }
}
