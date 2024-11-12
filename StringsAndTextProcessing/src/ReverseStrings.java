import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String reversedWord = new StringBuilder(input).reverse().toString();
            System.out.printf("%s = %s%n", input, reversedWord);

            input = scanner.nextLine();
        }
    }
}
