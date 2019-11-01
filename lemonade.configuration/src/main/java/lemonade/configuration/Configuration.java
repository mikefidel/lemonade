package lemonade.configuration;

import java.util.Arrays;
import java.util.Optional;

public class Configuration {
    protected final String[] commandline;
    protected final String appName;
    protected final String processId;
    protected final boolean flagIsDebugMode;
    protected final boolean flagShowHelpPrompt;
    protected final boolean flagUsesInputFile;
    protected final boolean flagUsesOutputFile;
    protected final Optional<String> inputFilename;
    protected final Optional<String> outputFilename;

    public Configuration(
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
        this.commandline = commandline;
        this.appName = appName;
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

    public String getAppName() {
        return appName;
    }

    public String getProcessId() {
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

    @Override
    public String toString() {
        return "Configuration{" +
                "commandline=" + Arrays.toString(commandline) +
                ", appName=" + appName +
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