package lemonade.csv.configuration;

import lemonade.configuration.CLIBuilder;
import lemonade.configuration.AbstractConfiguration;

import java.util.Arrays;

/**
 * POIBuilder is an concrete implementation class for POI-type Configuration objects.
 */
public class CSVBuilder extends CLIBuilder {
    private char delimiter;
    private String newline;

    @Override
    public AbstractConfiguration getInstance() {
        return new CSVConfiguration(
                commandline,
                appName,
                processId,
                flagIsDebugMode,
                flagShowHelpPrompt,
                flagUsesInputFile,
                flagUsesOutputFile,
                inputFilename,
                outputFilename,
                delimiter,
                newline
        );
    }

    @Override
    public String toString() {
        return "CSVBuilder{" +
                "commandline=" + Arrays.toString(commandline) +
                ", appName=" + appName +
                ", processId=" + processId +
                ", flagIsDebugMode=" + flagIsDebugMode +
                ", flagShowHelpPrompt=" + flagShowHelpPrompt +
                ", flagUsesInputFile=" + flagUsesInputFile +
                ", flagUsesOutputFile=" + flagUsesOutputFile +
                ", inputFilename=" + inputFilename +
                ", outputFilename=" + outputFilename +
                ", delimiter=" + delimiter +
                ", newline=" + newline +
                '}';
    }

    public void setDelimiter(char delimiter) {
        this.delimiter = delimiter;
    }

    public void setNewline(String newline) {
        this.newline = newline;
    }

}