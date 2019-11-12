package lemonade.configuration;

import java.util.Optional;

/**
 * CLIBuilder is an abstract class associated with all Configuration objects. It defines:
 * - concrete setter methods for properties that are shared by all Configuration types
 * - setter abstract methods unique to specific Configuration types
 * - an abstract method used for instantiating Configuration objects
 * - an abstract toString() method definition
 * <p>
 * It will be extended by sub-interfaces having Configuration type-specific properties and methods.
 * The setter methods herein are called by methods in Template implementations.
 */
public abstract class CLIBuilder implements Builder {
    protected String[] commandline;
    protected String appName;
    protected String processId;
    protected boolean flagIsDebugMode;
    protected boolean flagShowHelpPrompt;
    protected boolean flagUsesInputFile;
    protected boolean flagUsesOutputFile;
    protected Optional<String> inputFilename;
    protected Optional<String> outputFilename;

    public abstract AbstractConfiguration getInstance();

    public void setCommandline(String[] commandline) {
        this.commandline = commandline;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setProcessId(String pid) {
        this.processId = pid;
    }

    public void setIsDebugMode(boolean debugMode) {
        flagIsDebugMode = debugMode;
    }

    public void setShowHelpPrompt(boolean isShowHelpPrompt) {
        flagShowHelpPrompt = isShowHelpPrompt;
    }

    public void setUsesInputFile(boolean usesInputFile) {
        flagUsesInputFile = usesInputFile;
    }

    public void setUsesOutputFile(boolean usesOutputFile) {
        flagUsesOutputFile = usesOutputFile;
    }

    public void setInputFilename(Optional<String> inputFilename) {
        // Todo optional processing
    }

    public void setOutputFilename(Optional<String> outputFilename) {
        // Todo optional processing
    }

}