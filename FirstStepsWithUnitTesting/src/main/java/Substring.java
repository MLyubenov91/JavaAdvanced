public class Substring {
    public static String removeOccurrences(String toRemove, String input) {

        input = input.replace(toRemove, "");

        while (input.contains("  ")) {
            input = input.replace("  ", " ");
        }

        return input.trim();
    }
}
