package lemonade.cli.csv;

import java.util.Arrays;

public class LemonCSV {

    private final String[] cmdLine;

    public LemonCSV(final String[] cmdLine) {
        this.cmdLine = cmdLine;
    }

    public static void main(final String[] args ) {
        LemonCSV app = new LemonCSV(args);
        app.run();
    }

    public void run() {
    }

    @Override
    public String toString() {
        return "LemonCSV{" +
                "commandLine=" + Arrays.toString(cmdLine) +
                '}';
    }
}