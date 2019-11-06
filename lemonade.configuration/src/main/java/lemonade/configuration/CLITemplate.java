package lemonade.configuration;

import org.apache.commons.cli.*;

import java.lang.management.ManagementFactory;

/**
 * CLITemplate is an abstract class used for processing commandline options input
 * by the user when invoking the application from a commandline. It is based on
 * the software design Template pattern where a specific sequence of processing
 * steps must be followed, and whereby variations in these processing steps are
 * handled by concrete method implementations found in subclasses.
 * <p>
 * The processing order is tightly coupled to the Apache Commons CLI artifact,
 * information for which is found at https://commons.apache.org/proper/commons-cli/
 * <p>
 * It is used together with Builder objects which contain setter classes
 * to define Configuration object properties. The template method
 * configure(Builder builder)
 * provides the processing steps; it can not be overridden!
 * <p>
 * In addition to the template method, it also contains a number of helper methods.
 */
public abstract class CLITemplate implements Template {
    private final String[] commandline;
    private final String appName;
    private Options optionDefinitions;

    public CLITemplate(final String[] commandline, final String appName) {
        this.commandline = commandline;
        this.appName = appName;
    }

    /*
    Methods implemented by subclasses.
     */
    protected abstract Options defineOptions() throws ParseException;

    protected abstract void resolveOptions(CommandLine parsedCommandline, Builder builder);

    /**
     * This is the template method for creating Apache CLI-based Configuration objects.
     *
     * @param builder Builder object that contains all setter methods for the Configuration type being
     *                built, as well as methods involved in determining its property values.
     * @return resulting immutable Configuration object
     * @throws ParseException when an invalid option is found in the commandline passed when the
     *                        application is invoked.
     */
    public final Configuration configure(final Builder builder) throws ParseException {
        CommandLine parsedCommandline;

        optionDefinitions = defineOptions();
        parsedCommandline = parseCommandline(optionDefinitions, commandline);
        resolveSharedOptions(parsedCommandline, builder);
        resolveOptions(parsedCommandline, builder);
        return builder.getInstance();
    }

    private CommandLine parseCommandline(final Options options, final String[] cmdline) throws ParseException {

        // Apache Commons CLI - Step #2 of 3: Parse all command-line parameters
        CommandLine parsed;
        CommandLineParser parser = new DefaultParser();

        try {
            parsed = parser.parse(options, cmdline);
        } catch (ParseException e) {
            String errMsg = this.getClass().getSimpleName() + ": " + e.getMessage();
            throw new ParseException(errMsg);
        }

        return parsed;
    }

    private void resolveSharedOptions(final CommandLine parsedCommandline, final Builder builder) {
        processCommandline(builder);
        processPID(builder);
        processShowHelpFlag(builder, parsedCommandline);
        processDebugModeFlag(builder, parsedCommandline);
        // TODO other base options

    }

    private void processDebugModeFlag(final Builder builder, final CommandLine parsedCommandline) {
        builder.setIsDebugMode(parsedCommandline.hasOption(CLIOptionConstants.LONG_OPT_DEBUG) ? true : false);
    }

    private void processShowHelpFlag(final Builder builder, final CommandLine parsedCommandline) {
        if (parsedCommandline.hasOption((CLIOptionConstants.LONG_OPT_HELP))) {
            builder.setShowHelpPrompt(true);
            printHelpText();
        } else {
            builder.setShowHelpPrompt(false);
        }
    }

    private void printHelpText() {
        String prefix = "java -jar " + appName + ".jar";
        String header = "where parameter options are:";
        String footer = "";
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(132, prefix, header, optionDefinitions, footer, true);
    }

    private void processPID(final Builder builder) {
        String pid = Long.toString(ManagementFactory.getRuntimeMXBean().getPid());
        builder.setProcessId(pid);
    }

    private void processCommandline(final Builder builder) {
        builder.setCommandline(commandline);
    }

    /**
     * Constants shared when processing all commandline options
     */
    public static class CLIOptionConstants {

        public static final String OPT_HELP = "h";
        public static final String LONG_OPT_HELP = "help";

        public static final String OPT_DEBUG = "X";
        public static final String LONG_OPT_DEBUG = "debug";

//        private static final String OPT_INPUT = "i";
//        private static final String LONG_OPT_INPUT =  "input";
//
//        private static final String OPT_NEWLINE = "n";
//        private static final String LONG_OPT_NEWLINE = "newline";
//
//        private static final String OPT_OUTPUT = "o";
//        private static final String LONG_OPT_OUTPUT = "output";
//
//        private static final String OPT_SERVER = "S";
//
//        private static final String CONVERT_CSV = "CSV";
//        private static final String CONVERT_TSV = "TSV";
//        private static final String CONVERT_EXCEL = "EXCEL";

//        public static final char TAB = '\t';
//        public static final char COMMA = ',';
//
//        public static final String WINDOWS = "WINDOWS";
//        public static final String LINUX = "LINUX";
//        public static final String OSX = "OSX";
//        public static final String OLDMAC = "OLDMAC";
//        public static final String SYSTEM = "SYSTEM";
//        public static final String ESCAPE_N = "\n";
//        public static final String ESCAPE_R = "\r";
//        public static final String ESCAPE_R_ESCAPE_N = "\r\n";
    }

}