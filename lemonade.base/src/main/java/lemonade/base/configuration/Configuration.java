package lemonade.base.configuration;

public interface Configuration {
    public Configuration getInstance();
}

interface BaseConfigurationInterface extends Configuration {
    String[] getArgs();
    boolean isHelp();
    boolean usesStdInput();
    boolean usesStdOutput();
    boolean isDebugMode();
    String getInputFilename();
    String getOutputFilename();
}

interface CSVConfigurationInterface extends Configuration {
    NewLine getNewline();
}

interface POIConfigurationInterface extends Configuration {
    String getProcessID();
}

