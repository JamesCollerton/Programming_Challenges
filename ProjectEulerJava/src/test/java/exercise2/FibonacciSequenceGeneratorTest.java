package exercise2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FibonacciSequenceGeneratorTest {

    @Test
    public void given10_whenGenerate_thenList1and2and3and5and8() {
        FibonacciSequenceGenerator generator = new FibonacciSequenceGenerator();
        List<Integer> expectedList = IntStream.of(1, 2, 3, 5, 8).boxed().collect(Collectors.toList());
        assertThat(generator.apply(10)).isEqualTo(expectedList);
    }

    @Test
    public void given5_whenGenerate_thenList1and2and3() {
        FibonacciSequenceGenerator generator = new FibonacciSequenceGenerator();
        List<Integer> expectedList = IntStream.of(1, 2, 3).boxed().collect(Collectors.toList());
        assertThat(generator.apply(5)).isEqualTo(expectedList);
    }

    @Test
    public void given15_whenGenerate_thenList1and2and3and5and8and13() {
        FibonacciSequenceGenerator generator = new FibonacciSequenceGenerator();
        List<Integer> expectedList = IntStream.of(1, 2, 3, 5, 8, 13).boxed().collect(Collectors.toList());
        assertThat(generator.apply(5)).isEqualTo(expectedList);
    }

    @Test
    public void given0_whenGenerate_thenList1() {
        FibonacciSequenceGenerator generator = new FibonacciSequenceGenerator();
        List<Integer> expectedList = IntStream.of(1).boxed().collect(Collectors.toList());
        assertThat(generator.apply(0)).isEqualTo(expectedList);
    }

    @Test
    public void given1_whenGenerate_thenList1and2() {
        FibonacciSequenceGenerator generator = new FibonacciSequenceGenerator();
        List<Integer> expectedList = IntStream.of(1, 2).boxed().collect(Collectors.toList());
        assertThat(generator.apply(1)).isEqualTo(expectedList);
    }

}