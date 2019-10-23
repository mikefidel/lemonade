package lemonade.configuration;

import org.apache.commons.cli.*;

public abstract class CLITemplate implements Template {
    protected final String[] commandline;

    public CLITemplate(final String[] commandline) {
        this.commandline = commandline;
    }

    public void configure(Builder builder) throws ParseException { }

}
