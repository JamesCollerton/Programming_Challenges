package projecteuler.tdd.romannumerals;

/*
    1. Get the leftmost character, check the one to the right.
    2. If the one to the right is worth more, subtract.
    3. If the one to the right is worth less, add.
 */
public class RomanNumeralConverter {

    private SingleRomanNumeralConverter singleRomanNumeralConverter;

    RomanNumeralConverter(SingleRomanNumeralConverter singleRomanNumeralConverter) {
        this.singleRomanNumeralConverter = singleRomanNumeralConverter;
    }

    public int apply(String input) {
        return recursiveStep(0, input);
    }

    private int recursiveStep(int runningTotal, String input) {

        if(input.length() == 0) {
            return runningTotal;
        }

        if(input.length() == 1) {
            return runningTotal + singleRomanNumeralConverter.apply(input);
        }

        return multipleCharacterNumeralConverter(runningTotal, input);

    }

    private int multipleCharacterNumeralConverter(int runningTotal, String input) {

        String firstCharacter = input.substring(0, 1);
        String secondCharacter = input.substring(1, 2);

        int firstValue = singleRomanNumeralConverter.apply(firstCharacter);
        int secondValue = singleRomanNumeralConverter.apply(secondCharacter);

        if(firstValue < secondValue) {
            int newValue = runningTotal + (secondValue - firstValue);
            return recursiveStep(newValue, input.substring(2));
        }

        return recursiveStep(runningTotal + firstValue, input.substring(1));

    }

}
