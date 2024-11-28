public class Substring {
    public static String removeOccurrences(String toRemove, String input) {

        input = input.replace(toRemove, "");

        return input.trim();
    }
}
