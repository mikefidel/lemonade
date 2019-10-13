package lemonade.poi.configuration;

import lemonade.configuration.Configuration;
import java.util.Optional;

public class POIBuilder implements BuilderPOIExtension {

    @Override
    public void setCommandline(String[] commandline) {

    }

    @Override
    public void setProcessId(Optional<String> processId) {

    }

    @Override
    public void setIsDebugMode(boolean debugMode) {

    }

    @Override
    public void setShowHelpPrompt(boolean isShowHelpPrompt) {

    }

    @Override
    public void setUsesInputFile(boolean usesInputFile) {

    }

    @Override
    public void setUsesOutputFile(boolean usesOutputFile) {

    }

    @Override
    public void setInputFilename(Optional<String> inputFilename) {

    }

    @Override
    public void setOutputFilename(Optional<String> outputFilename) {

    }

    @Override
    public Configuration getInstance() {
        return null;
    }

}