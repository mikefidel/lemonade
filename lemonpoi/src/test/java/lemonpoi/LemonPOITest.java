package lemonpoi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LemonPOITest {

    @Disabled
    @DisplayName("Not yet implemented")
    void main() {
    }

    @Disabled
    @DisplayName("Not yet implemented")
    void run() {
    }

    @Disabled
    @DisplayName("Not yet implemented")
    void configureByCLI() {
    }

    @Disabled
    @DisplayName("Not yet implemented")
    void dispatchByOperation() {
    }

    @Disabled
    @DisplayName("Not yet implemented")
    void getCommandline() {
    }

    @Test
    @DisplayName("The calling classname should be 'lemonpoi'")
    void testForCorrectClassName() {
        String[] args = {"arg-1", "arg-2"};
        LemonPOI app = new LemonPOI(args);
        System.out.println("appName=" + app.getAppName());
        assertEquals("lemonpoi", app.getAppName());
    }

    @Disabled
    @DisplayName("Not yet implemented")
    void testToString() {
    }
}