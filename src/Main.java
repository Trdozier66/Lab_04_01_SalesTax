public class Main {
    public static void main(String[] args) {
        double purchasePrice = 100.00; // Example price
        double salesTaxRate = 0.05; // 5% sales tax
        double salesTax = purchasePrice * salesTaxRate;

        System.out.println("Purchase Price: $" + purchasePrice);
        System.out.println("Sales Tax (5%): $" + salesTax);
    }
}
