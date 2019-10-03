package lemonade.cli.poi;

import java.util.Arrays;

public class LemonPOI {

    private final String[] cmdLine;

    public LemonPOI(final String[] cmdLine) {
        this.cmdLine = cmdLine;
    }

    public static void main(final String[] args ) {
        LemonPOI app = new LemonPOI(args);
        app.run();
    }

    public void run() {
    }

    @Override
    public String toString() {
        return "LemonPOI{" +
                "commandLine=" + Arrays.toString(cmdLine) +
                '}';
    }
}