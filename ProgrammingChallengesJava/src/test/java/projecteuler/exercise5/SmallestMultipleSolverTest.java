package projecteuler.exercise5;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestMultipleSolverTest {

    private SmallestMultipleSolver solver;

    @Before
    public void setUp() {
        solver = new SmallestMultipleSolver();
    }

    @Test
    public void given4_whenApply_then6() {
        assertThat(solver.apply(4)).isEqualTo(6);
    }

    @Test
    public void given5_whenApply_then12() {
        assertThat(solver.apply(5)).isEqualTo(12);
    }

    @Test
    public void given10_whenApply_then2520() {
        assertThat(solver.apply(10)).isEqualTo(2520);
    }

}