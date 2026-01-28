package CH2;

public class Problem21 {

    // Class constant (static because it belongs to the class, final because it should not change)
    public static final double TAX_RATE = 0.0825;

    public static void main(String[] args) {

        // System constant identifier used for output
        System.out.println("System.out is used to print to the console.");

        double price = 100.00;
        double total = price + (price * TAX_RATE);

        System.out.println("Price = " + price);
        System.out.println("TAX_RATE = " + TAX_RATE);
        System.out.println("Total with tax = " + total);

        // Local constant (inside a method, it is final, not static)
        final int MAX_ATTEMPTS = 3;
        System.out.println("MAX_ATTEMPTS = " + MAX_ATTEMPTS);
    }
}
