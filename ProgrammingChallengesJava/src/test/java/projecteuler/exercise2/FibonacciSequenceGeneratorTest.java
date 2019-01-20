package projecteuler.exercise2;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Before;
import org.junit.Test;

public class FibonacciSequenceGeneratorTest {

    private FibonacciSequenceGenerator generator;

    @Before
    public void setUp() {
        generator = new FibonacciSequenceGenerator();
    }

    @Test
    public void given10_whenGenerate_thenList1and2and3and5and8() {
        List<Integer> expectedList = listOf(1, 2, 3, 5, 8);
        assertThat(generator.apply(10)).isEqualTo(expectedList);
    }

    @Test
    public void given5_whenGenerate_thenList1and2and3() {
        List<Integer> expectedList = listOf(1, 2, 3);
        assertThat(generator.apply(5)).isEqualTo(expectedList);
    }

    @Test
    public void given15_whenGenerate_thenList1and2and3and5and8and13() {
        List<Integer> expectedList = listOf(1, 2, 3, 5, 8, 13);
        assertThat(generator.apply(15)).isEqualTo(expectedList);
    }

    @Test
    public void given0_whenGenerate_thenListEmpty() {
        assertThat(generator.apply(0)).isEqualTo(new ArrayList<>());
    }

    @Test
    public void given1_whenGenerate_thenList1() {
        List<Integer> expectedList = listOf(1);
        assertThat(generator.apply(1)).isEqualTo(expectedList);
    }

    /*
    UTILITIES
     */

    private List<Integer> listOf(Integer ... integers) {
        return Arrays.stream(integers).collect(Collectors.toList());
    }

}