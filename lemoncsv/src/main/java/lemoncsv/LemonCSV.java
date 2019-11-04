package lemoncsv;

import lemonade.configuration.Builder;
import lemonade.configuration.Configuration;
import lemonade.configuration.Template;
import lemonade.csv.configuration.CSVBuilder;
import lemonade.csv.configuration.CSVTemplate;
import org.apache.commons.cli.ParseException;

import java.util.Arrays;

public class LemonCSV {
    private String[] commandline;
    private String appName;

    public LemonCSV(final String[] args) {
        commandline = (args == null) ? new String[0] : args;
        appName = this.getClass().getSimpleName().toLowerCase();
    }

    public static void main(final String[] args) {
        new LemonCSV(args).launch();
    }

    public void launch() {

        try {
            Configuration cfg = configureByCLI(commandline, appName);
            dispatchByOperation(cfg);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    protected Configuration configureByCLI(final String[] commandline, String appName) throws ParseException {
        Template template = new CSVTemplate(commandline, appName);
        Builder builder = new CSVBuilder();
        return template.configure(builder);
    }

    protected void dispatchByOperation(final Configuration cfg) {
        if (!cfg.isShowHelpPrompt()) {
            // TODO
        }
    }

    protected String[] getCommandline() {
        return commandline;
    }

    protected String getAppName() {
        return appName;
    }

    @Override
    public String toString() {
        return "LemonCSV{" +
                "commandline=" + Arrays.toString(getCommandline()) +
                ", appName='" + getAppName() + '\'' +
                '}';
    }
}