package lemonade.csv.configuration;

import lemonade.configuration.Builder;
import lemonade.configuration.Configuration;

import java.util.Arrays;
import java.util.Optional;

public class CSVBuilder implements Builder {
    private String[] commandline;
    private String appName;
    private String processId;
    private boolean flagIsDebugMode;
    private boolean flagShowHelpPrompt;
    private boolean flagUsesInputFile;
    private boolean flagUsesOutputFile;
    private Optional<String> inputFilename;
    private Optional<String> outputFilename;
    private char delimiter;
    private String newline;

    @Override
    public Configuration getInstance() {
        return new Configuration(
                commandline,
                appName,
                processId,
                flagIsDebugMode,
                flagShowHelpPrompt,
                flagUsesInputFile,
                flagUsesOutputFile,
                inputFilename,
                outputFilename
        );
    }

    @Override
    public void setCommandline(String[] commandline) {
        this.commandline = commandline;
    }

    @Override
    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public void setProcessId(String pid) {
        this.processId = pid;
    }

    @Override
    public void setIsDebugMode(boolean debugMode) {
        this.flagIsDebugMode = debugMode;
    }

    @Override
    public void setShowHelpPrompt(boolean isShowHelpPrompt) {
        this.flagShowHelpPrompt = isShowHelpPrompt;
    }

    @Override
    public void setUsesInputFile(boolean usesInputFile) {
        this.flagUsesInputFile = usesInputFile;
    }

    @Override
    public void setUsesOutputFile(boolean usesOutputFile) {
        this.flagUsesOutputFile = usesOutputFile;
    }

    @Override
    public void setInputFilename(Optional<String> inputFilename) {
        // Todo optional processing
    }

    @Override
    public void setOutputFilename(Optional<String> outputFilename) {
        // Todo optional processing
    }

    public void setDelimiter(char delimiter) {
        this.delimiter = delimiter;
    }

    public void setNewline(String newline) {
        this.newline = newline;
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
}