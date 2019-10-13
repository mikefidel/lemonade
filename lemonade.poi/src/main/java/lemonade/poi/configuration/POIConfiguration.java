package lemonade.poi.configuration;

import lemonade.configuration.Configuration;

import java.util.Optional;

public class POIConfiguration extends Configuration {

    public POIConfiguration(
            String[] commandline,
            Optional<String> processId,
            boolean flagIsDebugMode,
            boolean flagShowHelpPrompt,
            boolean flagUsesInputFile,
            boolean flagUsesOutputFile,
            Optional<String> inputFilename,
            Optional<String> outputFilename)
    {
        super(commandline,
                processId,
                flagIsDebugMode,
                flagShowHelpPrompt,
                flagUsesInputFile,
                flagUsesOutputFile,
                inputFilename,
                outputFilename);
    }
}