package projecteuler.exercise4;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LargestPalindromeProductSolverTest {

    private LargestPalindromeProductSolver solver;

    @Before
    public void setUp() {
        NineNumberGenerator generator = new NineNumberGenerator();
        PalindromeChecker checker = new PalindromeChecker();
        solver = new LargestPalindromeProductSolver(generator, checker);
    }

    @Test
    public void given1digits_whenApply_then9() {
        assertThat(solver.apply(1)).isEqualTo(9);
    }

    @Test
    public void given2digits_whenApply_then9009() {
        assertThat(solver.apply(2)).isEqualTo(9009);
    }

    @Test
    public void given3digits_whenApply_then9009() {
        assertThat(solver.apply(3)).isEqualTo(90909);
    }

}