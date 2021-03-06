import java.io.IOException;

public class Order {
    private Watch watch;
    private String costumerName;
    private String address;
    private String email;
    private final int amount = 1;

    public Order() {

    }
    public Order(String costumerName, String address, String email, Watch watch) {
        this.costumerName = costumerName;
        this.address = address;
        this.email = email;
        this.watch = watch;
    }

    public Watch getWatch() {
        return watch;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmount() {
        return amount;
    }

    public String generateReceipt(String currencyType) throws IOException {
        String temp = "";

        temp += "Costumer: " + this.costumerName + "\n";
        temp += "Brand: " + this.watch.getBrand() + "\n";
        temp += "Model: " + this.watch.getModel() + "\n";
        temp += "Price: " + this.watch.getPrice(currencyType) + "\n";
        temp += "Quantity: " + this.amount + "\n";

        return temp;
    }
}
