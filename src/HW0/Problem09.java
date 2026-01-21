package HW0;
public class Problem09 {

    public static void mystery(int n) {
        System.out.print("For n = " + n);
        while (n > 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
        }
        System.out.println(", the loop terminated.");
    }

    public static void run() {
        for (int i = 1; i < 100; i++) {
            mystery(i);
        }
    }

    public static void main(String[] args) {
        run();
    }
}
