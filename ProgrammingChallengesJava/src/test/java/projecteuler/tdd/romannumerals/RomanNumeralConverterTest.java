package projecteuler.tdd.romannumerals;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralConverterTest {

    private RomanNumeralConverter converter;

    @Before
    public void setUp() {
        SingleRomanNumeralConverter singleRomanNumeralConverter = new SingleRomanNumeralConverter();
        converter = new RomanNumeralConverter(singleRomanNumeralConverter);
    }

    @Test
    public void givenI_whenApply_then1() {
        assertThat(converter.apply("I")).isEqualTo(1);
    }

    @Test
    public void givenX_whenApply_then10() {
        assertThat(converter.apply("X")).isEqualTo(10);
    }

    @Test
    public void givenIX_whenApply_then9() {
        assertThat(converter.apply("IX")).isEqualTo(9);
    }

    @Test
    public void givenXX_whenApply_then20() {
        assertThat(converter.apply("XX")).isEqualTo(20);
    }

    @Test
    public void givenMCMXLIV_whenApply_then20() {
        assertThat(converter.apply("MCMXLIV")).isEqualTo(1944);
    }

}