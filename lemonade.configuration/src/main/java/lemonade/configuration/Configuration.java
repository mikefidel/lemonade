package lemonade.configuration;

import java.util.Optional;

public class Configuration {
    private final String[] commandline;
    protected final Optional<String> processId;
    protected final boolean flagIsDebugMode;
    protected final boolean flagShowHelpPrompt;
    protected final boolean flagUsesInputFile;
    protected final boolean flagUsesOutputFile;
    protected final Optional<String> inputFilename;
    protected final Optional<String> outputFilename;

    public Configuration(
            String[] commandline,
            Optional<String> processId,
            boolean flagIsDebugMode,
            boolean flagShowHelpPrompt,
            boolean flagUsesInputFile,
            boolean flagUsesOutputFile,
            Optional<String> inputFilename,
            Optional<String> outputFilename)
    {
        this.commandline = commandline;
        this.processId = processId;
        this.flagIsDebugMode = flagIsDebugMode;
        this.flagShowHelpPrompt = flagShowHelpPrompt;
        this.flagUsesInputFile = flagUsesInputFile;
        this.flagUsesOutputFile = flagUsesOutputFile;
        this.inputFilename = inputFilename;
        this.outputFilename = outputFilename;
    }

    public String[] getCommandline() {
        return commandline;
    }

    public Optional<String> getProcessId() {
        return processId;
    }

    public boolean isDebugMode() {
        return flagIsDebugMode;
    }

    public boolean isShowHelpPrompt() {
        return flagShowHelpPrompt;
    }

    public boolean usesInputFile() {
        return flagUsesInputFile;
    }

    public boolean usesOutputFile() {
        return flagUsesOutputFile;
    }

    public Optional<String> getInputFilename() {
        return inputFilename;
    }

    public Optional<String> getOutputFilename() {
        return outputFilename;
    }

}