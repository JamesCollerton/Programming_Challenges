package projecteuler.exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EvenFibonacciSumTest {

    private EvenFibonacciSum evenFibonacciSum;

    @Before
    public void setUp() {
        FibonacciSequenceGenerator generator = new FibonacciSequenceGenerator();
        evenFibonacciSum = new EvenFibonacciSum(generator);
    }

    @Test
    public void given10_whenApply_then19() {
        assertThat(evenFibonacciSum.apply(10)).isEqualTo(10);
    }

    @Test
    public void given5_whenApply_then2() {
        assertThat(evenFibonacciSum.apply(5)).isEqualTo(2);
    }

    @Test
    public void given8_whenApply_then2() {
        assertThat(evenFibonacciSum.apply(8)).isEqualTo(2);
    }

    @Test
    public void given35_whenApply_then44() {
        assertThat(evenFibonacciSum.apply(35)).isEqualTo(44);
    }

}