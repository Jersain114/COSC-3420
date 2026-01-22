package HW1;

public class Problem1 {

    static class FullTimeEmployee {}
    static class HourlyEmployee extends FullTimeEmployee {}
    static class SalariedEmployee extends FullTimeEmployee {}

    public static void main(String[] args) {

        FullTimeEmployee full = new FullTimeEmployee();
        SalariedEmployee salaried = new SalariedEmployee();

        full = salaried;

        // (a) Legal at compile-time and run-time
        salaried = (SalariedEmployee) full;
        System.out.println("Cast to SalariedEmployee works");

        // (b) Compile-time error
        // salaried = full;

        // (c) Compile-time error
        // salaried = (FullTimeEmployee) full;

        // (d) Compiles, but fails at run-time
        try {
            HourlyEmployee hourly = (HourlyEmployee) full;
        } catch (ClassCastException e) {
            System.out.println("Cast to HourlyEmployee fails at runtime");
        }
    }
}
