package lemonade.poi.configuration;

import lemonade.configuration.Builder;
import lemonade.configuration.CLITemplate;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public final class POITemplate extends CLITemplate {

    public POITemplate(final String[] commandline, final String appName) {
        super(commandline, appName);
    }

    /**
     * This method is the 1st of 3 steps that Apache CLI uses to process commandline options. All valid
     * options are defined within here.
     * @return an Options object containing all valid options and associated parameters.
     */
    @Override
    protected Options defineOptions() {
        Options options = new Options();

        options.addOption(
                Option.builder(CLIOptionConstants.OPT_HELP)
                        .longOpt(CLIOptionConstants.LONG_OPT_HELP)
                        .desc("Displays this help information.")
                        .build()
        );
        options.addOption(
                Option.builder(CLIOptionConstants.OPT_DEBUG)
                        .longOpt(CLIOptionConstants.LONG_OPT_DEBUG)
                        .desc("A flag used for debugging and development purposes. < -X | --DEBUG >")
                        .build()
        );

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
    protected void resolveOptions(CommandLine parsedCommandline, Builder builder) {
        // There are no POI-specific options to resolve.
    }

}