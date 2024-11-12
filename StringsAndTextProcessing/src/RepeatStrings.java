import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int repeatCount = word.length();
            result.append(word.repeat(repeatCount));
        }

        System.out.println(result);
    }
}
