package lemonade.configuration;

public abstract class CLITemplate implements Template {
    protected String[] commandline;

    public CLITemplate(String[] commandline) {
        this.commandline = commandline;
    }

    public void configure(Builder builder) {
        builder.setCommandline(this.commandline);
    }

}
