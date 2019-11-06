package lemonade.poi.configuration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Note: The test target consists of mostly getter methods. The only code segment worthwhile testing is the
 * toString method.
 */
class POIConfigurationTest {

    @Test
    @DisplayName("IsPOIConfigurationToStringMethodProperlyFormatted")

    void testToStringForProperFormatting() {
        String[] commandline = {"Arg-1", "Arg-2", "Arg-3"};
        String appName = "poi";
        String processId = "0123456789";
        boolean flagIsDebugMode = true;
        boolean flagIsShowHelpPrompt = true;
        boolean flagUsesInputFile = true;
        boolean flagUsesOutputFile = true;
        Optional<String> inputFilename = Optional.of("input/foo.bar");
        Optional<String> outputFilename = Optional.of("output/foo.bar");

        POIConfiguration poi = new POIConfiguration(
                commandline,
                appName,
                processId,
                flagIsDebugMode,
                flagIsShowHelpPrompt,
                flagUsesInputFile,
                flagUsesOutputFile,
                inputFilename,
                outputFilename
        );
        String expected = "POIConfiguration{commandline=[Arg-1, Arg-2, Arg-3], appName=poi, processId=0123456789, flagIsDebugMode=true, flagShowHelpPrompt=true, flagUsesInputFile=true, flagUsesOutputFile=true, inputFilename=Optional[input/foo.bar], outputFilename=Optional[output/foo.bar]}";
        assertEquals(expected, poi.toString());
    }

}