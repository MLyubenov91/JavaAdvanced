public class RepeatStrings {
    public String repeat(String[] input) {
        StringBuilder result = new StringBuilder();

        for (String word : input) {
            int repeatCount = word.length();
            result.append(word.repeat(repeatCount));
        }
        return result.toString().trim();
    }
}
