package HW0;
public class Problem05 {
    public static void main(String[] args) {
        String text = "The snow is now on the ground.";

        System.out.println("Hypothesis: The output will be 12.");

        int index = text.indexOf("now", 8);

        System.out.println("Actual output: " + index);

        System.out.println(
            "Explanation: indexOf with a starting index begins searching at index 8, " +
            "skipping the occurrence inside \"snow\" and finding the word \"now\" at index 12."
        );
    }
}
