public class Substring {
    public static String removeOccurrences(String toRemove, String input) {

        if (toRemove == null || input == null) {
            throw new IllegalArgumentException("Both substring and text must be non-null.");
        }

        input = input.replace(toRemove, "");

        while (input.contains("  ")) {
            input = input.replace("  ", " ");
        }

        return input.trim();
    }
}
