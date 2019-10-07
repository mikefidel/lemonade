package lemonade.base.configuration;

public enum NewLine {
    WINDOWS("\r\n"),
    LINUX("\n"),
    OSX("\n"),
    OLDMAC("\r"),
    SYSTEM(System.getProperty("line.separator")),
    NOT_SPECIFIED("not_specified");

    NewLine(String s) {
    }
}
