package lemonpoi;

import lemonade.configuration.Configuration;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LemonPOITest {

    @Disabled
    @DisplayName("Not yet implemented")
    void main() {
    }

    @Disabled
    @DisplayName("Not yet implemented")
    void launch() {
    }

    @Test
    @DisplayName("A Configuration object should be produced")
    void testForProducingAConfigurationObject() throws ParseException {
        String[] args = {""};
        LemonPOI app = new LemonPOI(args);
        Configuration cfg = app.configureByCLI(args, "lemonpoi");
        assertTrue(cfg instanceof Configuration);
    }

    @Test
    @DisplayName("The calling classname should pass options")
    void testForPassingCommandlineArgs() {
        String[] args = {"arg-1", "arg-2", "arg-3", "arg-4"};
        LemonPOI app = new LemonPOI(args);
        String[] actual = app.getCommandline();
        String[] expected = {"arg-1", "arg-2", "arg-3", "arg-4"};

        assertEquals(4, actual.length);
        for(int i=0; i < actual.length; i++) {
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
    @DisplayName("toString() method should show all instance variables")
    void testToString() {
        String[] args = {"arg-1", "arg-2"};
        LemonPOI app = new LemonPOI(args);
        String expected = "LemonPOI{commandline=[arg-1, arg-2], appName='lemonpoi'}";
        String actual = app.toString();
        assertEquals(expected, actual);
    }
}