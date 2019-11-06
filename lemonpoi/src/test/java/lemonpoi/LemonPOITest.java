package lemonpoi;

import lemonade.configuration.AbstractConfiguration;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LemonPOITest {

    @Test
    @DisplayName("The program should protect itself from null arguments passed to it")
    void testThatConstructorCanProtectItselfFromNullArgs() {
        LemonPOI app = new LemonPOI(null);
        String[] actual = app.getCommandline();
        assertEquals(0, actual.length);
    }

    @Test
    @DisplayName("A Configuration object should be produced")
    void testForProducingAConfigurationObject() throws ParseException {
        String[] args = {""};
        LemonPOI app = new LemonPOI(args);
        AbstractConfiguration cfg = app.configureByCLI(args, "lemonpoi");
        assertTrue(cfg instanceof AbstractConfiguration);
    }

    @Test
    @DisplayName("The calling classname should pass options")
    void testForPassingCommandlineArgs() {
        String[] args = {"arg-1", "arg-2", "arg-3", "arg-4"};
        LemonPOI app = new LemonPOI(args);
        String[] actual = app.getCommandline();
        String[] expected = {"arg-1", "arg-2", "arg-3", "arg-4"};

        assertEquals(4, actual.length);

        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    @DisplayName("The calling classname should be 'lemonpoi'")
    void testForCorrectClassName() {
        String[] args = {"arg-1", "arg-2"};
        LemonPOI app = new LemonPOI(args);
        assertEquals("lemonpoi", app.getAppName());
    }

    @Test
    @DisplayName("toString() method should show all instance properties")
    void testToString() {
        String[] args = {"arg-1", "arg-2"};
        LemonPOI app = new LemonPOI(args);
        String expected = "LemonPOI{commandline=[arg-1, arg-2], appName='lemonpoi'}";
        String actual = app.toString();
        assertEquals(expected, actual);
    }
}