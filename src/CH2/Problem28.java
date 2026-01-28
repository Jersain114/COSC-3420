package CH2;

public class Problem28 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];

        a[3] = 7;
        b[3] = 7;

        System.out.println(a.equals(b));
    }
}
