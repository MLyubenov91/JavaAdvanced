import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringToRemove = scanner.nextLine();
        String mainString = scanner.nextLine();

        while (mainString.contains(stringToRemove)) {
            mainString = mainString.replace(stringToRemove, "");
        }

        System.out.println(mainString);
    }
}
