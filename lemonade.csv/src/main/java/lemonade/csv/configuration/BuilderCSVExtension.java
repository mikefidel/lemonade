package lemonade.csv.configuration;

import lemonade.configuration.Builder;
import lemonade.configuration.Configuration;

public interface BuilderCSVExtension extends Builder {

    void setDelimiter(char delimiter);

    void setNewline(String newline);

    Configuration getInstance();

}