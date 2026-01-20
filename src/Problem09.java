public class Problem09 {

    // The method from the assignment (kept as-is, only formatting adjusted)
    public static void mystery(int n) {
        System.out.print("For n = " + n);
        while (n > 1)
            if (n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
        System.out.println(", the loop terminated.");
    }

    // A tracing version so you can "trace the execution when n = 7"
    public static void mysteryTrace(int n) {
        System.out.print("Trace for n = " + n + ": ");
        System.out.print(n);

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(" -> " + n);
        }
        System.out.println("\n(the loop terminated)\n");
    }

    // Returns true if it reaches 1 (terminates), false if we hit a step limit
    // (Step limit is just a safety net; for n < 100 it will terminate easily.)
    public static boolean terminates(int start, int stepLimit) {
        int n = start;
        int steps = 0;

        while (n > 1 && steps < stepLimit) {
            if (n % 2 == 0) n = n / 2;
            else n = 3 * n + 1;
            steps++;
        }
        return n == 1;
    }

    // "run method" requested by the assignment: show termination for n < 100
    public static void run() {
        int limit = 100;
        int stepLimit = 10_000;

        System.out.println("Checking termination for all positive integers n < " + limit + "...\n");

        for (int n = 1; n < limit; n++) {
            boolean ok = terminates(n, stepLimit);
            if (!ok) {
                System.out.println("Found a value that did NOT terminate within step limit: n = " + n);
                return;
            }
        }

        System.out.println("Result: The loop terminated for every n from 1 to 99.");
    }

    public static void main(String[] args) {
        // Part 1: Trace when n = 7
        mysteryTrace(7);

        // Optional: show the original mystery method output too
        mystery(7);
        System.out.println();

        // Part 2: Show termination for any positive integer n < 100
        run();
    }
}
