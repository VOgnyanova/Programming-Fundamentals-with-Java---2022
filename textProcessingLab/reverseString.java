package textProcessingLab;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        while (!word.equals("end")) {

            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                char currentSymbol = word.charAt(i);
                reverseWord = reverseWord + currentSymbol;


            }

            System.out.printf("%s = %s%n", word, reverseWord);
            word = scanner.nextLine();

        }
    }
}