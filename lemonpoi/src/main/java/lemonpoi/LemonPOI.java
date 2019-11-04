package lemonpoi;

import lemonade.configuration.Builder;
import lemonade.configuration.Configuration;
import lemonade.configuration.Template;
import lemonade.poi.configuration.POIBuilder;
import lemonade.poi.configuration.POITemplate;
import org.apache.commons.cli.ParseException;

import java.util.Arrays;

public class LemonPOI {
    private String[] commandline;
    private String appName;

    public LemonPOI(final String[] args) {
        commandline = (args == null) ? new String[0] : args;
        appName = this.getClass().getSimpleName().toLowerCase();
    }

    public static void main(final String[] args) {
        new LemonPOI(args).launch();
    }

    public void launch() {
        try {
            Configuration cfg = configureByCLI(getCommandline(), getAppName());
            dispatchByOperation(cfg);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    protected Configuration configureByCLI(final String[] commandline, final String appName) throws ParseException {
        Template template = new POITemplate(commandline, appName);
        Builder builder = new POIBuilder();
        return template.configure(builder);
    }

    protected void dispatchByOperation(final Configuration cfg) {
        if (!cfg.isShowHelpPrompt()) {
            // TODO
        }
    }

    public String[] getCommandline() {
        return commandline;
    }

    public String getAppName() {
        return appName;
    }

    @Override
    public String toString() {
        return "LemonPOI{" +
                "commandline=" + Arrays.toString(getCommandline()) +
                ", appName='" + getAppName() + '\'' +
                '}';
    }
}