package lemonade.cli.poi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LemonPOITest {

    @Test
    @DisplayName("Should instantiate itself without a command-line.")
    public void shouldInstantiateItselfWithoutACommandLine() {
        String[] cmdline = {};
        LemonPOI app = new LemonPOI(cmdline);
        String EXPECTED = "LemonPOI{commandLine=[]}";
        String ACTUAL = app.toString();
        Assertions.assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    @DisplayName("Should instantiate itself passing a command-line.")
    public void shouldInstantiateItselfPassingCommandLine() {
        String[] cmdline = {"arg1", "arg2", "arg3"};
        LemonPOI app = new LemonPOI(cmdline);
        String EXPECTED = "LemonPOI{commandLine=[arg1, arg2, arg3]}";
        String ACTUAL = app.toString();
        Assertions.assertEquals(EXPECTED, ACTUAL);
    }
}