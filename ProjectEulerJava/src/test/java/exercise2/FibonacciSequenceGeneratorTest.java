package exercise2;

import com.sun.tools.javac.util.List;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FibonacciSequenceGeneratorTest {

    @Test
    public void given10_whenGenerate_thenList1and2and3and5and8() {
        FibonacciSequenceGenerator generator = new FibonacciSequenceGenerator();
        assertThat(generator.apply(10)).isEqualTo(List.of(1, 2, 3, 5, 8));
    }

    @Test
    public void given5_whenGenerate_thenList1and2and3() {
        FibonacciSequenceGenerator generator = new FibonacciSequenceGenerator();
        assertThat(generator.apply(5)).isEqualTo(List.of(1, 2, 3));
    }

    @Test
    public void given15_whenGenerate_thenList1and2and3and5and8and13() {
        FibonacciSequenceGenerator generator = new FibonacciSequenceGenerator();
        assertThat(generator.apply(5)).isEqualTo(List.of(1, 2, 3, 5, 8, 13));
    }

}