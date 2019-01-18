package exercise1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplesOfThreeAndFiveSolverTest {

    @Test
    public void givenInputTen_whenApply_thenReturnTwentyThree() {
        MultiplesOfThreeAndFiveSolver solver = new MultiplesOfThreeAndFiveSolver();
        assertThat(solver.apply(10)).isEqualTo(23);
    }

    @Test
    public void givenInputFifteen_whenApply_thenReturnFifty() {
        MultiplesOfThreeAndFiveSolver solver = new MultiplesOfThreeAndFiveSolver();
        assertThat(solver.apply(15)).isEqualTo(45);
    }

    @Test
    public void givenInputZero_whenApply_thenReturnZero() {
        MultiplesOfThreeAndFiveSolver solver = new MultiplesOfThreeAndFiveSolver();
        assertThat(solver.apply(0)).isEqualTo(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenInputNegative_whenApply_thenThrows() {
        MultiplesOfThreeAndFiveSolver solver = new MultiplesOfThreeAndFiveSolver();
        solver.apply(-1);
    }

}