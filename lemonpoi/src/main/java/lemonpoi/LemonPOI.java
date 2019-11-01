package lemonpoi;

import lemonade.configuration.Builder;
import lemonade.configuration.Configuration;
import lemonade.poi.configuration.POIBuilder;
import lemonade.poi.configuration.POITemplate;

public class LemonPOI {
    private Configuration cfg;

    public void run(final String[] args) {
        String appName = this.getClass().getSimpleName().toLowerCase();

        try {
            POITemplate template = new POITemplate(args, appName);
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

    public static void main(final String[] args) {
        LemonPOI app = new LemonPOI();
        app.run(args);
    }

}