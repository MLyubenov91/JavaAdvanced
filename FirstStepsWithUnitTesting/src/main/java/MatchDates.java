import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static String Match(String dates) {
        if (dates == null) {
            throw new IllegalArgumentException("Input cannot be null!");
        }

        String regex = "\\b(?<day>\\d{2})(?<separator>[-./])(?<month>[A-Z][a-z]+)\\k<separator>(?<year>\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dates);

        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");

            result.append(String.format("Day: %s, Month: %s, Year: %s\n", day, month, year));
        }

        return !result.isEmpty() ? result.toString().trim() : "";
    }
}
