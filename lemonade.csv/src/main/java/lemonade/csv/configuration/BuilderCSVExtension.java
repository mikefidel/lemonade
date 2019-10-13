package lemonade.csv.configuration;

import lemonade.configuration.BuilderBase;
import lemonade.configuration.Configuration;

public interface BuilderCSVExtension extends BuilderBase {

    void setDelimiter(char delimiter);

    void setNewline(String newline);

    Configuration getInstance();

}