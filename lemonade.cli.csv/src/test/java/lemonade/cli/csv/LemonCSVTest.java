package lemonade.cli.csv;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LemonCSVTest {

    @Test
    @DisplayName("Should instantiate itself without a command-line.")
    public void shouldInstantiateItselfWithoutACommandLine() {
        String[] cmdline = {};
        LemonCSV app = new LemonCSV(cmdline);
        String EXPECTED = "LemonCSV{commandLine=[]}";
        String ACTUAL = app.toString();
        Assertions.assertEquals(EXPECTED, ACTUAL);
    }

    @Test
    @DisplayName("Should instantiate itself passing a command-line.")
    public void shouldInstantiateItselfPassingCommandLine() {
        String[] cmdline = {"arg1", "arg2", "arg3"};
        LemonCSV app = new LemonCSV(cmdline);
        String EXPECTED = "LemonCSV{commandLine=[arg1, arg2, arg3]}";
        String ACTUAL = app.toString();
        Assertions.assertEquals(EXPECTED, ACTUAL);
    }
}