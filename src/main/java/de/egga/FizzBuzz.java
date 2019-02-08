package de.egga;

class FizzBuzz {

    private static final String FIZZ = "fizz";

    String answer(Integer number) {

        if (isMultipleOfThree(number)) {
            return FIZZ;
        }

        return number.toString();
    }

    private boolean isMultipleOfThree(Integer number) {
        return number % 3 == 0;
    }
}
