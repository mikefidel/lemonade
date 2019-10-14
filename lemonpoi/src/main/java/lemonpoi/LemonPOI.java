package lemonpoi;

import lemonade.configuration.Configuration;

public class LemonPOI {
    Configuration cfg;

    public static void main(String[] args) {
        LemonPOI app = new LemonPOI();
        app.start();
    }

    public void start() {
        System.err.println("LemonPOI started");
    }

}
