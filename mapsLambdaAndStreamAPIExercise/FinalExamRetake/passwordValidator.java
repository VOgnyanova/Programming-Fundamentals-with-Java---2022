package FinalExamRetake;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        if (!passwordLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!passwordConsists(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!passwordMustHaveTwoDigitsOrMore(password)) {
            System.out.println("Password must have at least 2 digits");
        } if (passwordLength(password) && passwordConsists(password)
                && passwordMustHaveTwoDigitsOrMore(password)){
            System.out.println("Password is valid");
        }


    }

    private static boolean passwordLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean passwordConsists(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean passwordMustHaveTwoDigitsOrMore(String password) {
        int sum = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                sum++;
            }
        }
        if (sum >= 2) {
            return true;
        } else {
            return false;
        }
    }
}

