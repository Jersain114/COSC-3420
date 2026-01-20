public class Problem04 {
    public static void main(String[] args) {
        String text = "The snow is now on the ground.";

        System.out.println("Hypothesis: The output will be 12.");

        int index = text.indexOf("now");

        System.out.println("Actual output: " + index);

        System.out.println(
            "Explanation: indexOf returns the starting index of the substring. " +
            "The word \"now\" begins at index 12."
        );
    }
}
