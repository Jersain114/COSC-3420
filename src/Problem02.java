public class Problem02 {
    public static void main(String[] args) {
        int a = 37;
        int b = 5;

        System.out.println("Hypothesis: The output will be 0.");

        int result = a - a / b * b - a % b;

        System.out.println("Actual output: " + result);

        System.out.println(
            "Explanation: For positive integers a and b, " +
            "a = (a / b) * b + (a % b), so the expression always equals 0."
        );
    }
}