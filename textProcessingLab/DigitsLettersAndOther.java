package textProcessingLab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digitSb = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder other = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (Character.isDigit(symbol)) {
                digitSb.append(symbol);

            } else if (Character.isLetter(symbol)) {
                letter.append(symbol);

            } else {
                other.append(symbol);
            }

        }

        System.out.println(digitSb.toString());
        System.out.println(letter.toString());
        System.out.println(other.toString());

    }
}
