package lemonade.csv.configuration;

import lemonade.configuration.Configuration;

import java.util.Optional;

public class CSVConfiguration extends Configuration {
    private final char delimiter;
    private final String newline;

    public CSVConfiguration(
            String[] commandline,
            Optional<String> processId,
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
}