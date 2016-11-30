import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import models.Currency;
import models.YahooCurrencyConverter;

public class Main {

    private static ArrayList<Watch> catalog = new ArrayList<>();
    private static String currency = Currency.EURO;

    public static void main(String[] args) throws IOException {

        //HARDCODED list
        Currency orig = new Currency("Euro",Currency.EURO);
        catalog.add(new Watch("MJFU23","Rolex",30,600,orig));
        catalog.add(new Watch("MJFGF3","RolexY",50,800,orig));
        catalog.add(new Watch("A","PIM",1,10000,orig));
        catalog.add(new Watch("B","PIM",1,10001,orig));
        catalog.add(new Watch("SW3445","Swatch",30,10,orig));

        currency = UserInterface.selectCurrency();

        Main.printListByBrand();

        Order order = UserInterface.placeOrder(catalog);

        System.out.print(order.generateReceipt(currency));

    }



    private static void printListByBrand() throws IOException {

        Collections.sort(catalog, new Comparator<Watch>() {
            public int compare(Watch w1, Watch w2) {
                return w1.getBrand().compareTo(w2.getBrand());
            }
        });


        for (int i = 0 ; i < catalog.size(); i++){

            System.out.println(i+1 + " - " + catalog.get(i).getBrand() + " " + catalog.get(i).getModel() + " " + catalog.get(i).getPrice(currency));
        }
    }




}
