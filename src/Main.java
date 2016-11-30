import java.util.ArrayList;

import models.Currency;
import models.YahooCurrencyConverter;

public class Main {

    private static ArrayList<Watch> catalog = new ArrayList<>();

    public static void main(String[] args) {

        //HARDCODED list
        catalog.add(new Watch("MJFU23","Rolex",30));
        catalog.add(new Watch("MJFU26","Rolex",3));
        catalog.add(new Watch("MJFU23","Rolex",30));
        catalog.add(new Watch("MJFU23","Rolex",30));
        catalog.add(new Watch("MJFU23","Rolex",30));
        catalog.add(new Watch("MJFU23","Rolex",30));
        catalog.add(new Watch("MJFU23","Rolex",30));




        YahooCurrencyConverter ycc = new YahooCurrencyConverter();

        Currency exampleCurrency = new Currency("Dollar", Currency.DOLLAR);
        Currency exampleCurrency1 = new Currency("Euro", Currency.EURO);

        try {
            // Com o object currency
            float rateObject = exampleCurrency.convertTo(exampleCurrency1);
            // Com o codigo da currency
            float rateCode = exampleCurrency.convertTo(exampleCurrency1.type);
            System.out.println(rateObject);
            System.out.println(rateCode);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }



}
