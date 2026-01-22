package HW1;

import java.util.*;

public class Problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        A a;
        int code = sc.nextInt();

        if (code == 0)
            a = new A();
        else
            a = new D();

        System.out.println(a);
        // System.out.println(a.toString()); // same output
    }
}

class A {
    public String toString() {
        return "A";
    }
}

class D extends A {
    public String toString() {
        return "D";
    }
}