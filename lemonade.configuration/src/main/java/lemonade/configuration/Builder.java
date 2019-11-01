package lemonade.configuration;

import java.util.Optional;

public interface Builder {

    Configuration getInstance();

    void setCommandline(String[] commandline);

    void setAppName(String appName);

    void setProcessId(String processId);

    void setIsDebugMode(boolean debugMode);

    void setShowHelpPrompt(boolean isShowHelpPrompt);

    void setUsesInputFile(boolean usesInputFile);

    void setUsesOutputFile(boolean usesOutputFile);

    void setInputFilename(Optional<String> inputFilename);

    void setOutputFilename(Optional<String> outputFilename);

}