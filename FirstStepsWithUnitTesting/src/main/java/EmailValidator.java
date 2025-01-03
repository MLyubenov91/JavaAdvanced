import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean isValid(String email) {
        String regex = "^[-a-zA-Z-0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);

        return pattern.equals(email);
    }
}
