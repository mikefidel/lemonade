package lemonade.poi.configuration;

import lemonade.configuration.Builder;
import lemonade.configuration.CLITemplate;
import org.apache.commons.cli.*;

public class POITemplate extends CLITemplate {

    private Options CSVParameterOptions;

    public POITemplate(String[] commandline) {
        super(commandline);
    }

    @Override
    public final void configure(Builder builder) throws ParseException {

        CommandLine parsedParams = defineParams();



        builder.setCommandline(commandline);
        builder.setIsDebugMode(true);
        builder.setUsesInputFile(true);
    }

    protected CommandLine defineParams() throws ParseException {

        // Apache Commons CLI - Step #1 of 3: Define all command-line parameters
        setCSVParameterOptions( new Options());

        getCSVParameterOptions().addOption(
                Option.builder(OptionConstants.OPT_HELP)
                        .longOpt(OptionConstants.LONG_OPT_HELP)
                        .desc("Displays this help information.")
                        .build()
        );

        // Apache Commons CLI - Step #2 of 3: Parse all command-line parameters
        CommandLine parsed;
        CommandLineParser parser = new DefaultParser();
        try {
            parsed = parser.parse(getCSVParameterOptions(), super.commandline);
        } catch (ParseException e) {
            String errMsg = this.getClass().getSimpleName() + ": " + e.getMessage();
            throw new ParseException(errMsg);
        }

        return parsed;
    }

    public void setCSVParameterOptions(Options csvParameterOptions) {
        this.CSVParameterOptions = csvParameterOptions;
    }

    public Options getCSVParameterOptions() {
        return CSVParameterOptions;
    }

    public static class OptionConstants {

        private static final String OPT_HELP =  "h";
        private static final String LONG_OPT_HELP =  "help";

        private static final String OPT_INPUT = "i";
        private static final String LONG_OPT_INPUT =  "input";

        private static final String OPT_NEWLINE = "n";
        private static final String LONG_OPT_NEWLINE = "newline";

        private static final String OPT_OUTPUT = "o";
        private static final String LONG_OPT_OUTPUT = "output";

        private static final String OPT_SERVER = "S";

        private static final String OPT_DEBUG =  "X";
        private static final String LONG_OPT_DEBUG =  "debug";

        private static final String CONVERT_CSV = "CSV";
        private static final String CONVERT_TSV = "TSV";
        private static final String CONVERT_EXCEL = "EXCEL";

        public static final char TAB = '\t';
        public static final char COMMA = ',';

        public static final String WINDOWS = "WINDOWS";
        public static final String LINUX = "LINUX";
        public static final String OSX = "OSX";
        public static final String OLDMAC = "OLDMAC";
        public static final String SYSTEM = "SYSTEM";
        public static final String ESCAPE_N = "\n";
        public static final String ESCAPE_R = "\r";
        public static final String ESCAPE_R_ESCAPE_N = "\r\n";
    }
}
