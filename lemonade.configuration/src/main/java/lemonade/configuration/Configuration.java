package lemonade.configuration;

import java.util.Optional;

/**
 * Configuration objects are expected to be immutable and possess the mandatory
 * configuration properties required by the application. The getter methods defined
 * in this interface specify these properties.
 */
public interface Configuration {

    String[] getCommandline();

    String getAppName();

    String getProcessId();

    boolean isDebugMode();

    boolean isShowHelpPrompt();

    boolean usesInputFile();

    boolean usesOutputFile();

    Optional<String> getInputFilename();

    Optional<String> getOutputFilename();

    String toString();

}