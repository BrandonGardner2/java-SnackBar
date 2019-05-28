package snackApp;

public class Customer {
    // fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    // constructor
    public Customer(String name, double cash) {
        maxId++;
        id = maxId;

        this.name = name;
        this.cash = cash;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void addCash(double cash) {
        this.cash = this.cash + cash;
    }

    public void tryPurchase(double amount) {
        if (amount < this.cash) {
            makePurchase(amount);
        } else {
            denyPurchase();
        }
    }

    public Boolean makePurchase(double amount) {
        this.cash = this.cash - amount;
        return true;
    }

    public Boolean denyPurchase() {
        return false;
    }
}