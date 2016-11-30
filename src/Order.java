public class Order {
    private Watch watch;
    private String costumerName;
    private String address;
    private String email;
    private final int amount = 1;

    public Order() {

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

    public String generateReceipt(int currencyType) {
        String temp = "";

        temp += this.costumerName + "\n";
        temp += this.watch.getBrand() + "\n";
        temp += this.watch.getModel() + "\n";
        temp += this.watch.getPrice(currencyType) + "\n";
        temp += this.amount + "\n";
        temp += "\nTotal Price: " + this.watch.getPrice(currencyType) * this.amount;

        return temp;
    }
}
