import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumbers {
    public static String Match(String text) {
        String regex = "\\+359 2 [0-9]{3} [0-9]{4}|\\+359-2-[0-9]{3}-[0-9]{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        StringBuilder validPhones = new StringBuilder();

        while (matcher.find()) {
            validPhones.append(matcher.group()).append(", ");
        }

        return validPhones.toString().trim();
    }
}
