
import models.Currency;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {


    public static String selectCurrency()
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Currency: ");

        return sc.nextLine();
    }

    public static Order placeOrder(ArrayList<Watch> catalog)
    {
        Scanner sc = new Scanner(System.in);

        String name, address, paypalEmail;

        System.out.println("Enter watch id: ");
        Watch selectedWatch = catalog.get(sc.nextInt() - 1);
        sc.nextLine();

        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter your address: ");
        address = sc.nextLine();

        System.out.println("Enter your Paypal email: ");
        paypalEmail = sc.nextLine();

        //System.out.print(selectedWatch.getBrand() + " " + name + " " + address + " " + paypalEmail);

        return new Order(name,address, paypalEmail, selectedWatch);
    }
}
