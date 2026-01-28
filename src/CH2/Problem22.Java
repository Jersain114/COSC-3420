package CH2;

import java.io.IOException;

public class Problem22 {

    public static void main(String[] args) {

        // Catch ANY exception
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }

        // Catch input/output exceptions
        try {
            throw new IOException("Example IO problem");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e);
        }

        // Catch runtime exceptions
        try {
            int[] arr = new int[3];
            System.out.println(arr[10]);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
}
