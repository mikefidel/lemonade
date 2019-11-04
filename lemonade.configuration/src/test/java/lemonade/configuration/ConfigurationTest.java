package lemonade.configuration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConfigurationTest {
    protected final String[] commandline = {"arg-1", "arg-2", "arg-3", "arg-4"};
    protected final String appName = "lemon_pie";
    protected final String processId = "1234567890";
    protected final boolean flagIsDebugMode = true;
    protected final boolean flagShowHelpPrompt = true;
    protected final boolean flagUsesInputFile = true;
    protected final boolean flagUsesOutputFile = true;
    protected final Optional<String> inputFilename = Optional.of("lemon pies are amazing treats...");
    protected final Optional<String> outputFilename = Optional.of("especially when they have a thick meringue topping!");

    Configuration c = new Configuration(
            commandline,
            appName,
            processId,
            flagIsDebugMode,
            flagShowHelpPrompt,
            flagUsesInputFile,
            flagUsesOutputFile,
            inputFilename,
            outputFilename
    );

    @Test
    @DisplayName("All properties in a Configuration object should be accessible")
    void testThatAllConfigurationPropertiesCanBeAccessed() {
        assertEquals(commandline, c.getCommandline());
        assertEquals(appName, c.getAppName());
        assertEquals(processId, c.getProcessId());
        assertTrue(c.isDebugMode());
        assertTrue(c.isShowHelpPrompt());
        assertTrue(c.usesInputFile());
        assertTrue(c.usesOutputFile());
        assertEquals(inputFilename, c.getInputFilename());
        assertEquals(outputFilename, c.getOutputFilename());
    }

}