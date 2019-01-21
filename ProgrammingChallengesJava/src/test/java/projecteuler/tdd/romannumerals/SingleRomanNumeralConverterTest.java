package projecteuler.tdd.romannumerals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingleRomanNumeralConverterTest {

    @Test
    public void givenI_whenApply_then1() {
        SingleRomanNumeralConverter converter = new SingleRomanNumeralConverter();
        assertThat(converter.apply("I")).isEqualTo(1);
    }

    @Test
    public void givenL_whenApply_then50() {
        SingleRomanNumeralConverter converter = new SingleRomanNumeralConverter();
        assertThat(converter.apply("L")).isEqualTo(50);
    }

}