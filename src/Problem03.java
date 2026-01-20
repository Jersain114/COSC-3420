public class Problem03 {
    public static void main(String[] args) {
        System.out.println("Hypothesis:");
        System.out.println("1 / 0 will throw ArithmeticException (/ by zero).");
        System.out.println("1.0 / 0 will print Infinity.\n");

        System.out.println("Testing 1 / 0:");
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }

        System.out.println("\nTesting 1.0 / 0:");
        System.out.println(1.0 / 0);
    }
}