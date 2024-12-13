import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MatchPhoneNumbers {
    public static String Match(String text) {
        String regex = "\\+359 2 [0-9]{3} [0-9]{4}|\\+359-2-[0-9]{3}-[0-9]{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> matches = new ArrayList<>();

        while (matcher.find()) {
            matches.add(matcher.group());
        }

        return matches.stream()
                .map(String::trim) // Use method reference for compactness
                .collect(Collectors.joining(", "));
    }
}
