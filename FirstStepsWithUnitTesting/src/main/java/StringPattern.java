public class StringPattern {
    public static String GeneratePatternedString(String input, int repetitionFactor) {
        if (input.isEmpty() || input == null || repetitionFactor <= 0) {
            throw new IllegalArgumentException("Input string cannot be empty and repetition factor must be positive");
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repetitionFactor; i++) {
            for (int j = 0; j < input.length(); j++) {
                char currentChar = j % 2 == 0 ? Character.toLowerCase(input.charAt(j)) : Character.toUpperCase(input.charAt(j));
            }
        }

        return result.toString();
    }
}


