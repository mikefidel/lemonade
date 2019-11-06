package lemonade.configuration;

import org.apache.commons.cli.ParseException;

public interface Template {

    Configuration configure(Builder builder) throws ParseException;

}
