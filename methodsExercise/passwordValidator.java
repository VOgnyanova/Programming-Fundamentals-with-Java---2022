package methodsExercise;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        boolean isPasswordLengthValid = lengthCharacters(password);
        if (!isPasswordLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isValidDigitAndLetters = isValidLettersAndDigits(password);
        if (!isValidDigitAndLetters) {
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isValidPasswordCountDigits = countDigits(password);
        if (!isValidPasswordCountDigits) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isPasswordLengthValid && isValidDigitAndLetters && isValidPasswordCountDigits) {
            System.out.println("Password is valid");
        }
    }

    private static boolean lengthCharacters(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;

        } else {
            return false;

        }
    }

    private static boolean isValidLettersAndDigits(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;


            }

        }
        return true;
    }

    private static boolean countDigits(String password) {
        int countDigits = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        if (countDigits >= 2) {
            return true;
        } else {
            return false;
        }

    }
}
