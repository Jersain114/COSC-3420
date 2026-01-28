package CH2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Problem23 {

    // This method can throw either exception so both catch blocks are reachable.
    private static void maybeThrow(boolean fileMissing) throws IOException {
        if (fileMissing) {
            throw new FileNotFoundException("File not found error");
        }
        throw new IOException("General IO error");
    }

    public static void main(String[] args) {

        // Case 1: FileNotFoundException
        try {
            maybeThrow(true);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException");
        } catch (IOException e) {
            System.out.println("Caught IOException");
        }

        // Case 2: IOException (not FileNotFoundException)
        try {
            maybeThrow(false);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException");
        } catch (IOException e) {
            System.out.println("Caught IOException");
        }
    }
}