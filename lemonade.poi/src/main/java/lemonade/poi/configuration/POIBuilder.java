package lemonade.poi.configuration;

import lemonade.configuration.Builder;
import lemonade.configuration.Configuration;
import java.util.Optional;

public class POIBuilder implements Builder {
    private String[] commandline;
    private Optional<String> processId;
    private boolean flagIsDebugMode;
    private boolean flagShowHelpPrompt;
    private boolean flagUsesInputFile;
    private boolean flagUsesOutputFile;
    private Optional<String> inputFilename;
    private Optional<String> outputFilename;

    @Override
    public Configuration getInstance() {
        return new Configuration(
                commandline,
                processId,
                flagIsDebugMode,
                flagShowHelpPrompt,
                flagUsesInputFile,
                flagUsesOutputFile,
                inputFilename,
                outputFilename);
    }

    @Override
    public void setCommandline(String[] commandline) {
        this.commandline = commandline;
    }

    @Override
    public void setProcessId(Optional<String> processId) {
    // Todo optional processing
    }

    @Override
    public void setIsDebugMode(boolean debugMode) {
        flagIsDebugMode = debugMode;
    }

    @Override
    public void setShowHelpPrompt(boolean isShowHelpPrompt) {
        flagShowHelpPrompt = isShowHelpPrompt;
    }

    @Override
    public void setUsesInputFile(boolean usesInputFile) {
        flagUsesInputFile = usesInputFile;
    }

    @Override
    public void setUsesOutputFile(boolean usesOutputFile) {
        flagUsesOutputFile = usesOutputFile;
    }

    @Override
    public void setInputFilename(Optional<String> inputFilename) {
        // Todo optional processing
    }

    @Override
    public void setOutputFilename(Optional<String> outputFilename) {
        // Todo optional processing
    }

}