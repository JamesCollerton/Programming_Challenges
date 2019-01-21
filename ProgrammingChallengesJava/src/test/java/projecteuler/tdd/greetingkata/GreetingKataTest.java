package projecteuler.tdd.greetingkata;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

public class GreetingKataTest {

    private GreetingKata greetingKata;

    @Before
    public void setUp() {
        greetingKata = new GreetingKata();
    }

    @Test
    public void givenBob_whenGreet_thenHelloBob() {
        assertThat(greetingKata.greet("Bob")).isEqualTo("Hello, Bob.");
    }

    @Test
    public void givenJames_whenGreet_thenHelloJames() {
        assertThat(greetingKata.greet("James")).isEqualTo("Hello, James.");
    }

    @Test
    public void givenNull_whenGreet_thenHelloMyFriend() {
        assertThat(greetingKata.greet(null)).isEqualTo("Hello, my friend.");
    }

    @Test
    public void givenBOB_whenGreet_thenHELLOBOB() {
        assertThat(greetingKata.greet("BOB")).isEqualTo("HELLO BOB!");
    }

    @Test
    public void givenJillAndJane_whenGreet_thenHelloJillAndJane() {
        assertThat(greetingKata.greet("Jill", "Jane")).isEqualTo("Hello, Jill and Jane.");
    }

}