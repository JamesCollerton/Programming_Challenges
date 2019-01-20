package projecteuler.exercise4;

public class PalindromeChecker {

    public boolean isPalindrome(int input) {

        String forwardString = Integer.toString(input);

        StringBuilder stringBuilder = new StringBuilder(forwardString);

        String reverseString = stringBuilder.reverse().toString();

        return forwardString.equals(reverseString);

    }

}
