package lemoncsv;

import lemonade.configuration.Builder;
import lemonade.configuration.Configuration;
import lemonade.csv.configuration.CSVBuilder;
import lemonade.csv.configuration.CSVTemplate;

public class LemonCSV {
    private Configuration cfg;

    public void run(final String[] args) {
        String appName = this.getClass().getSimpleName().toLowerCase();

        try {
            CSVTemplate template = new CSVTemplate(args, appName);
            Builder builder = new CSVBuilder();
            cfg = template.configure(builder);
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

    public static void main(final String[] args) {
        LemonCSV app = new LemonCSV();
        app.run(args);
    }

}
