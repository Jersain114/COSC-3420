package HW1;

import java.text.NumberFormat;
import java.util.Locale;

public class Problem3 {

    static class Employee {
        private String name;
        private double grossPay;

        public Employee(String name, double grossPay) {
            this.name = name;
            this.grossPay = grossPay;
        }

        public String toString() {
            NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
            return name + " " + nf.format(grossPay);
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee("O’Brien,Theresa", 74400.00);
        System.out.println(e);
    }
}

