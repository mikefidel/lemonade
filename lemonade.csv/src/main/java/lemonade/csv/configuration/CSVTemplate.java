package lemonade.csv.configuration;

import lemonade.configuration.Builder;
import lemonade.configuration.CLITemplate;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public final class CSVTemplate extends CLITemplate {

    public CSVTemplate(final String[] commandline, final String appName) {
        super(commandline, appName);
    }

    /**
     * This method is the 1st of 3 steps that Apache CLI uses to process command-line options. Type=specific
     * options are defined here. Shared Configuration options are defined in the Template object superclass.
     *
     * @return an Options object containing valid options and associated parameters.
     */
    @Override
    protected Options defineExtendedOptions(Options options) {
        options.addOption(
                Option.builder(CLIOptionConstants.OPT_NEWLINE)
                        .longOpt(CLIOptionConstants.LONG_OPT_NEWLINE)
                        .hasArg()
                        .desc("Platform-dependent newline characters. < WINDOWS | LINUX | OSX | OLDMAC | SYSTEM > Default: SYSTEM.")
                        .build()
        );

        return options;
    }

    /**
     * This method interrogates and resolves POI-specific options found on the command-line
     * when the program is invoked.
     *
     * POI does not have command-line options to resolve at the present time. Only base options
     * should be processed.
     */
    @Override
    protected void resolveExtendedOptions(CommandLine parsedCommandline, Builder builder) {
        // There are no POI-specific options to resolve.
    }

}