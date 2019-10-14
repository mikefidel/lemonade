package lemoncsv;

import lemonade.configuration.Configuration;

public class LemonCSV {
    Configuration cfg;

    public static void main(String[] args) {

        LemonCSV app = new LemonCSV();
        app.start();
    }

    public void start() {
        System.err.println("LemonCSV started");
    }

}
