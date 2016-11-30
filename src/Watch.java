public class Watch {
    private String model;
    private String brand;
    private int amount;
    //TODO
    //private float price;

    public Watch() {

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

    public void getBrand(int currencyType) {
        return;
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
