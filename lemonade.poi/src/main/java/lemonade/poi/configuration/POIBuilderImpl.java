package lemonade.poi.configuration;

import lemonade.configuration.CLIBuilder;
import lemonade.configuration.AbstractConfiguration;

import java.util.Arrays;

/**
 * POIBuilder is an implementation class for POI-type Configuration objects.
 */
public final class POIBuilderImpl extends CLIBuilder {

    @Override
    public AbstractConfiguration getInstance() {
        return new POIConfiguration(
                commandline,
                appName,
                processId,
                flagIsDebugMode,
                flagShowHelpPrompt,
                flagUsesInputFile,
                flagUsesOutputFile,
                inputFilename,
                outputFilename);
    }

    @Override
    public String toString() {
        return "POIBuilder{" +
                "commandline=" + Arrays.toString(commandline) +
                ", processId=" + processId +
                ", flagIsDebugMode=" + flagIsDebugMode +
                ", flagShowHelpPrompt=" + flagShowHelpPrompt +
                ", flagUsesInputFile=" + flagUsesInputFile +
                ", flagUsesOutputFile=" + flagUsesOutputFile +
                ", inputFilename=" + inputFilename +
                ", outputFilename=" + outputFilename +
                '}';
    }

}