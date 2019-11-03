package lemonpoi;

import lemonade.configuration.Builder;
import lemonade.configuration.Configuration;
import lemonade.configuration.Template;
import lemonade.poi.configuration.POIBuilder;
import lemonade.poi.configuration.POITemplate;

public class LemonPOI {
    private static String appName;
    private Configuration cfg;

    public LemonPOI() {
        appName = this.getClass().getSimpleName().toLowerCase();
    }

    public void run(final String[] args) {

        try {
            Template template = new POITemplate(args, getAppName());
            Builder builder = new POIBuilder();
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

    public static String getAppName() {
        return appName;
    }

    public static void main(final String[] args) {
        new LemonPOI().run(args);
    }

}