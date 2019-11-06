package lemonade.configuration;

import org.apache.commons.cli.ParseException;

public interface Template {

    AbstractConfiguration configure(Builder builder) throws ParseException;

}
