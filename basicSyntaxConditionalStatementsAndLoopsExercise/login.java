package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int position = userName.length() - 1; position >= 0; position--) {
            char currentSymbol = userName.charAt(position);
            password += currentSymbol;
        }
        int countFailed = 0;
        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(password)) {
            countFailed++;
            if (countFailed == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", userName);


        }

    }


}