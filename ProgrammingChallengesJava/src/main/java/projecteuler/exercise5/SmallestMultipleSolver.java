package projecteuler.exercise5;

public class SmallestMultipleSolver {

    public int apply(int maxDivisor) {
        return recursiveStep(1, maxDivisor);
    }

    private int recursiveStep(int currentNumber, int maxDivisor) {
        for(int i = 2; i < maxDivisor; i++) {
            if(currentNumber % i != 0) {
                return recursiveStep(currentNumber + 1, maxDivisor);
            }
        }
        return currentNumber;
    }

}
