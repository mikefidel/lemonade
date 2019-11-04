package lemoncsv;

import lemonade.configuration.Configuration;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LemonCSVTest {

    @Test
    @DisplayName("The program should protect itself from null arguments passed to it")
    void testThatConstructorCanProtectItselfFromNullArgs() {
        LemonCSV app = new LemonCSV(null);
        String[] actual = app.getCommandline();
        assertEquals(0, actual.length);
    }

    @Test
    @DisplayName("A Configuration object should be produced")
    void testForProducingAConfigurationObject() throws ParseException {
        String[] args = {""};
        LemonCSV app = new LemonCSV(args);
        Configuration cfg = app.configureByCLI(args, "lemoncsv");
        assertTrue(cfg instanceof Configuration);
    }

    @Test
    @DisplayName("The calling classname should pass options")
    void testForPassingCommandlineArgs() {
        String[] args = {"arg-1", "arg-2", "arg-3", "arg-4"};
        LemonCSV app = new LemonCSV(args);
        String[] actual = app.getCommandline();
        String[] expected = {"arg-1", "arg-2", "arg-3", "arg-4"};

        assertEquals(4, actual.length);

        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    @DisplayName("The calling classname should be 'lemoncsv'")
    void testForCorrectClassName() {
        String[] args = {"arg-1", "arg-2"};
        LemonCSV app = new LemonCSV(args);
        assertEquals("lemoncsv", app.getAppName());
    }

    @Test
    @DisplayName("toString() method should show all instance properties")
    void testToString() {
        String[] args = {"arg-1", "arg-2"};
        LemonCSV app = new LemonCSV(args);
        String expected = "LemonCSV{commandline=[arg-1, arg-2], appName='lemoncsv'}";
        String actual = app.toString();
        assertEquals(expected, actual);
    }
}