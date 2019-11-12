package lemonade.poi.configuration;

import lemonade.configuration.Builder;
import lemonade.configuration.CLITemplate;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public final class POITemplate extends CLITemplate {

    public POITemplate(final String[] commandline, final String appName) {
        super(commandline, appName);
    }

    /**
     * POI does not have commandline options to define. Only shared options
     * should be processed.
     */
    @Override
    protected Options defineExtendedOptions(Options options) throws ParseException {
        return options;
    }

    /**
     * This method interrogates and resolves POI-specific options found on the commandline
     * when the program is invoked.
     *
     * POI does not have commandline options to resolve at the present time. Only base options
     * should be processed.
     */
    @Override
    protected void resolveExtendedOptions(CommandLine parsedCommandline, Builder builder) {
        // There are no POI-specific options to resolve.
    }

}