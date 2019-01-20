package projecteuler.exercise4;

/*
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    Find the largest palindrome made from the product of two 3-digit numbers.

    Strategy:
        Triangular numbers
        Find first one that is a palindrome
 */
public class LargestPalindromeProductSolver {

    private NineNumberGenerator nineNumberGenerator;
    private PalindromeChecker palindromeChecker;

    public LargestPalindromeProductSolver(NineNumberGenerator nineNumberGenerator, PalindromeChecker palindromeChecker) {
        this.nineNumberGenerator = nineNumberGenerator;
        this.palindromeChecker = palindromeChecker;
    }

    public int apply(int numberDigits) {

        // Create largest number with nines in with x number of digits
        int largestNumber = nineNumberGenerator.apply(numberDigits);

        // Pass to recursive algorithm
        return apply(largestNumber, largestNumber);
    }

    private int apply(int rapidlyDecreasingNumber, int slowlyDecreasingNumber) {
        if(slowlyDecreasingNumber == 0) {
            return 0;
        }

        if(rapidlyDecreasingNumber == 0) {
            slowlyDecreasingNumber -= 1;
            rapidlyDecreasingNumber = slowlyDecreasingNumber;
        }

        int multiplicationResult = rapidlyDecreasingNumber * slowlyDecreasingNumber;

        if(palindromeChecker.isPalindrome(multiplicationResult)) {
            return multiplicationResult;
        }

        return apply(rapidlyDecreasingNumber - 1, slowlyDecreasingNumber);
    }

}
