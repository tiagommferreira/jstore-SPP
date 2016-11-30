import java.util.ArrayList;

import models.Currency;
import models.YahooCurrencyConverter;

public class Main {

    private static ArrayList<Watch> catalog = new ArrayList<>();

    public static void main(String[] args) {

        //HARDCODED list
        Currency orig = new Currency("Euro",Currency.EURO);
        catalog.add(new Watch("MJFU23","Rolex",30,600,orig));
        catalog.add(new Watch("MJFU23","Rolex",30,600,orig));



    }



}
