package projecteuler.exercise4;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeCheckerTest {

    private PalindromeChecker palindromeChecker;

    @Before
    public void setUp() {
        palindromeChecker = new PalindromeChecker();
    }

    @Test
    public void given9009_whenApply_thenTrue() {
        assertThat(palindromeChecker.isPalindrome(9009)).isEqualTo(true);
    }

    @Test
    public void given9008_whenApply_thenFalse() {
        assertThat(palindromeChecker.isPalindrome(9008)).isEqualTo(false);
    }

}