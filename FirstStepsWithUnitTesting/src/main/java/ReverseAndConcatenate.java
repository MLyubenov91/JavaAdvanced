public class ReverseAndConcatenate {
    public static String ReverseAndConcatenateStrings(String[] inputStrings) {
        if (inputStrings == null || inputStrings.length == 0) {
            return "";
        }

        StringBuilder reversedStrings = new StringBuilder();
        for (int i = inputStrings.length - 1; i >= 0; i--) {
            reversedStrings.append(inputStrings[i]);
        }

        return reversedStrings.toString();
    }
}
