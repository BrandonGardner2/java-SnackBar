package snackApp;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // Food vending machine
        Snack s1 = new Snack("Chips", 36, 1.75, food.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, food.getId());

        // Drink vending machine
        Snack s4 = new Snack("Soda", 24, 2.50, drink.getId());
        Snack s5 = new Snack("Water", 20, 2.75, drink.getId());

        // Test One
        if (c1.tryPurchase(s4.getTotalCost(3))) {
            s4.buySnack(3);
        }
        System.out.println(c1.getCash());
        System.out.println(s4.quantity);

        // Test Two
        if (c1.tryPurchase(s3.getTotalCost(1))) {
            s3.buySnack(1);
        }
        System.out.println(c1.getCash());
        System.out.println(s3.quantity);

        // Test Three
        if (c2.tryPurchase(s4.getTotalCost(2))) {
            s4.buySnack(2);
        }
        System.out.println(c2.getCash());
        System.out.println(s4.quantity);

        // Test Four
        c1.addCash(10);
        System.out.println(c1.getCash());

        // Test Five
        if (c1.tryPurchase(s2.getTotalCost(1))) {
            s2.buySnack(1);
        }
        System.out.println(c1.getCash());
        System.out.println(s2.quantity);

        // Test Six
        s3.addQuantity(12);
        System.out.println(s3.quantity);

        // Test Seven
        if (c2.tryPurchase(s3.getTotalCost(3))) {
            s3.buySnack(3);
        }
        System.out.println(c2.getCash());
        System.out.println(s3.quantity);
    }
}
