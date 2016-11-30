package models;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Currency {
    public static final String EURO = "EUR";
    public static final String DOLLAR = "USD";
    public static final String GBP = "GBP";

    public static final List<String> currenciesAvailable = Arrays.asList(EURO, DOLLAR, GBP);

    public String type;
    public String name;

    public Currency(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    public float getRate(String toCurrency) throws IOException {
        YahooCurrencyConverter ycc = new YahooCurrencyConverter();
        return ycc.convert(this.type, toCurrency);
    }
    public float getRate(Currency currency) throws IOException {
        YahooCurrencyConverter ycc = new YahooCurrencyConverter();
        return ycc.convert(this.type, currency.type);
    }

    public float convertTo(float value, Currency currency) throws IOException {
        YahooCurrencyConverter ycc = new YahooCurrencyConverter();
        float rate = ycc.convert(this.type, currency.type);

        return value * rate;
    }

}
