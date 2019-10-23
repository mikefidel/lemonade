package lemonpoi;

import lemonade.configuration.Builder;
import lemonade.configuration.Configuration;
import lemonade.poi.configuration.POIBuilder;
import lemonade.poi.configuration.POIConfiguration;
import lemonade.poi.configuration.POITemplate;

import java.util.Optional;

public class LemonPOI {
    private static Configuration cfg;

    static {
        LemonPOI.cfg = new POIConfiguration(
                new String[0],
                Optional.empty(),
                false,
                false,
                false,
                false,
                Optional.empty(),
                Optional.empty());
    }

    public static void main(final String[] args) {

        try {
            POITemplate template = new POITemplate(args);
            Builder builder = new POIBuilder();
            template.configure(builder);
            LemonPOI.cfg = builder.getInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static Configuration getCfg() {
        return LemonPOI.cfg;
    }
}