package exercise2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EvenFibonacciSumTest {

    @Test
    public void given10_whenApply_then19() {
        EvenFibonacciSum evenFibonacciSum = new EvenFibonacciSum();
        assertThat(evenFibonacciSum.apply(10)).isEqualTo(10);
    }

    @Test
    public void given5_whenApply_then2() {
        EvenFibonacciSum evenFibonacciSum = new EvenFibonacciSum();
        assertThat(evenFibonacciSum.apply(5)).isEqualTo(2);
    }

    @Test
    public void given8_whenApply_then2() {
        EvenFibonacciSum evenFibonacciSum = new EvenFibonacciSum();
        assertThat(evenFibonacciSum.apply(8)).isEqualTo(2);
    }

    @Test
    public void given35_whenApply_then44() {
        EvenFibonacciSum evenFibonacciSum = new EvenFibonacciSum();
        assertThat(evenFibonacciSum.apply(35)).isEqualTo(44);
    }

}