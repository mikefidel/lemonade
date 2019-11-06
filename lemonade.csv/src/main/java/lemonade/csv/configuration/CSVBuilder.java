package lemonade.csv.configuration;

import lemonade.configuration.Builder;

/**
 * CSVBuilder is an interface associated with CSV Configuration objects. It defines
 * abstract setter methods unique to CSVConfiguration objects
 */
public interface CSVBuilder extends Builder {

    void setDelimiter(char delimiter);

    void setNewline(String newline);

}