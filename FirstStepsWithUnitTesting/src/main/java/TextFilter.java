public class TextFilter {
    public static String Filter(String[] bannedWords, String text) {
        for (String word : bannedWords) {
            if (text.contains(word)) {
                text = text.replace(word, ("*".repeat(word.length())));
            }
        }

        return text;
    }
}
