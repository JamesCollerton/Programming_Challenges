package projecteuler.exercise4;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NineNumberGeneratorTest {

    private NineNumberGenerator nineNumberGenerator;

    @Before
    public void setUp() {
        nineNumberGenerator = new NineNumberGenerator();
    }

    @Test
    public void given0_whenApply_then0() {
        assertThat(nineNumberGenerator.apply(0)).isEqualTo(0);
    }

    @Test
    public void given1_whenApply_then9() {
        assertThat(nineNumberGenerator.apply(1)).isEqualTo(9);
    }

    @Test
    public void given2_whenApply_then99() {
        assertThat(nineNumberGenerator.apply(2)).isEqualTo(99);
    }

    @Test
    public void given3_whenApply_then999() {
        assertThat(nineNumberGenerator.apply(3)).isEqualTo(999);
    }

}