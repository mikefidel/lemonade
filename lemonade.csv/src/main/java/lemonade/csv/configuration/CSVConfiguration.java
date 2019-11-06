package lemonade.csv.configuration;

import lemonade.configuration.AbstractConfiguration;

import java.util.Arrays;
import java.util.Optional;

/**
 * CSVConfiguration is the concrete implementation class for the application configuration object.
 */
public class CSVConfiguration extends AbstractConfiguration {
    private final char delimiter;
    private final String newline;

    public CSVConfiguration(
            String[] commandline,
            String appName,
            String processId,
            boolean flagIsDebugMode,
            boolean flagShowHelpPrompt,
            boolean flagUsesInputFile,
            boolean flagUsesOutputFile,
            Optional<String> inputFilename,
            Optional<String> outputFilename,
            char delimiter,
            String newline)
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

        this.delimiter = delimiter;
        this.newline = newline;
    }

    public char getDelimiter() {
        return delimiter;
    }

    public String getNewline() {
        return newline;
    }

    /**
     * Overrides Object.toString()
     * @return state of the POIConfiguration object properties as a formatted string.
     */
    @Override
    public String toString() {
        return "CSVConfiguration{" +
                "commandline=" + Arrays.toString(getCommandline()) +
                ", appName=" + getAppName() +
                ", processId=" + getProcessId() +
                ", flagIsDebugMode=" + isDebugMode() +
                ", flagShowHelpPrompt=" + isShowHelpPrompt() +
                ", flagUsesInputFile=" + usesInputFile() +
                ", flagUsesOutputFile=" + usesOutputFile() +
                ", inputFilename=" + getInputFilename() +
                ", outputFilename=" + getOutputFilename() +
                ", delimiter=" + getDelimiter() +
                ", newline=" + getNewline() +
                '}';
    }

}