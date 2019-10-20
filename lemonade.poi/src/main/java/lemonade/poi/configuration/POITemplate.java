package lemonade.poi.configuration;

import lemonade.configuration.CLITemplate;

public class POITemplate extends CLITemplate {

    public POITemplate(String[] commandline) {
        super(commandline);
    }

    public final void configure(){

    }

    public String[] getCommandline() {
        return commandline;
    }
}
