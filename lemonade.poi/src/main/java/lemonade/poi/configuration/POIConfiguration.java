package lemonade.poi.configuration;

import lemonade.configuration.AbstractConfiguration;

import java.util.Arrays;
import java.util.Optional;

/**
 * POIConfiguration is the concrete implementation class for the application configuration object.
 */
public final class POIConfiguration extends AbstractConfiguration {

    public POIConfiguration(
            String[] commandline,
            String appName,
            String processId,
            boolean flagIsDebugMode,
            boolean flagShowHelpPrompt,
            boolean flagUsesInputFile,
            boolean flagUsesOutputFile,
            Optional<String> inputFilename,
            Optional<String> outputFilename)
    {
        super(commandline,
                appName,
                processId,
                flagIsDebugMode,
                flagShowHelpPrompt,
                flagUsesInputFile,
                flagUsesOutputFile,
                inputFilename,
                outputFilename);
    }

    /**
     * Overrides Object.toString()
     * @return state of the POIConfiguration object properties as a formatted string.
     */
    @Override
    public String toString() {
        return "POIConfiguration{" +
                "commandline=" + Arrays.toString(getCommandline()) +
                ", appName=" + getAppName() +
                ", processId=" + getProcessId() +
                ", flagIsDebugMode=" + isDebugMode() +
                ", flagShowHelpPrompt=" + isShowHelpPrompt() +
                ", flagUsesInputFile=" + usesInputFile() +
                ", flagUsesOutputFile=" + usesOutputFile() +
                ", inputFilename=" + getInputFilename() +
                ", outputFilename=" + getOutputFilename() +
                '}';
    }

}