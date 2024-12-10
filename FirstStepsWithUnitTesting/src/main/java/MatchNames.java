import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchNames {
    public static String Match(String names) {
        if (names == null) {
            throw new NullPointerException();
        }

        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(names);

        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group()).append(" ");
        }

        return sb.toString().trim();
    }
}
