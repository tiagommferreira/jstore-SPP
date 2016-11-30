import models.Currency;

import java.io.IOException;

public class Watch {
    private String model;
    private String brand;
    private int amount;
    private Currency original;
    private float price;

    public Watch(String model, String brand, int amount,float price, Currency original) {
        this.model = model;
        this.brand = brand;
        this.amount = amount;
        this.price= price;
        this.original = original;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice(String currencyType) throws IOException {

        Currency convert = new Currency(currencyType,currencyType);
        return original.convertTo(price,convert);
    }

    public void decrement() {
        amount--;
        if(amount < 0) {
            amount = 0;
        }
    }

    public boolean isAvailable() {
        return amount > 0;
    }

}
