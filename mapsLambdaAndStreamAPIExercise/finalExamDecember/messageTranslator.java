package finalExamDecember;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class messageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "!(?<command>[A-Z][a-z]{2,})!:(\\[)(?<word>[A-Za-z]{8,})\\]";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
             String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                printPassword(matcher);

            } else {


                System.out.println("The message is invalid");

            }
        }
    }

    public static void printPassword(Matcher matcher) {
        String command = matcher.group("command");
        String letters = matcher.group("word");
        System.out.println(command + ":");
        for (int j = 0; j < letters.length(); j++) {
            char symbol = letters.charAt(j);
            int s = symbol;
            System.out.print(" " + s);

        }
        System.out.println();

    }
}
