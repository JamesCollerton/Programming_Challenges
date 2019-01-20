package projecteuler.exercise1;

import java.util.stream.IntStream;

class MultiplesOfThreeAndFiveSolver {

    int apply(int input) throws IllegalArgumentException {

        if(input < 0) {
            throw new IllegalArgumentException("Argument cannot be less than zero");
        }

        return IntStream.range(0, input).filter(this::isMultipleOfThreeOrFive).sum();
    }

    private boolean isMultipleOfThreeOrFive(int input) {
        return input % 3 == 0 || input % 5 == 0;
    }

}
