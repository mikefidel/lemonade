package lemoncsv;

import lemonade.configuration.Builder;
import lemonade.configuration.Configuration;
import lemonade.csv.configuration.CSVBuilder;
import lemonade.csv.configuration.CSVTemplate;

public class LemonCSV {
    private static String appName;

    public LemonCSV() {
        appName = this.getClass().getSimpleName().toLowerCase();
    }

    public void run(final String[] args) {

        try {
            CSVTemplate template = new CSVTemplate(args, getAppName());
            Builder builder = new CSVBuilder();
            Configuration cfg = template.configure(builder);
            dispatchByOperation(cfg);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void dispatchByOperation(Configuration cfg) {

        if ( !cfg.isShowHelpPrompt() ) {
            // TODO call abstract factory to initialize run
        }
    }

    public static String getAppName() {
        return appName;
    }

    public static void main(final String[] args) {
        new LemonCSV().run(args);
    }

}
