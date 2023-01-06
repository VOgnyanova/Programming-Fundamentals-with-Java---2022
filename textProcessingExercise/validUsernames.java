package textProcessingExercise;

import java.util.Scanner;

public class validUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String[] usernames = input.split(", ");

        for (String username : usernames) {
            if (isValidUserName(username)) {
                System.out.println(username);
            }

        }

    }

    public static boolean isValidUserName(String name) {
        if (name.length() < 3 || name.length() > 16) {
            return false;

        }
        for (char symbol : name.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
