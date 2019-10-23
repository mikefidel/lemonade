package lemonade.configuration;

import org.apache.commons.cli.ParseException;

public interface Template {

    void configure(Builder builder) throws ParseException;

}
