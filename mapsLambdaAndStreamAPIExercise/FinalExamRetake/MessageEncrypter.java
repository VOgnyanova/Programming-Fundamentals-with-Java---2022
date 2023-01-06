package FinalExamRetake;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageEncrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "(?<symbols>[*|@])(?<tagName>[A-Za-z]{3,})\\1: \\[(?<first>[A-Za-z])\\]\\|\\[(?<second>[A-Za-z])\\]\\|\\[(?<third>[A-Za-z])\\]\\|";
        Pattern pattern = Pattern.compile(regex);


        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);


            if (matcher.find()) {

                String tagName = matcher.group("tagName");


                char first = matcher.group("first").charAt(0);
                char second = matcher.group("second").charAt(0);
                char third = matcher.group("third").charAt(0);

                int encryptedFirst = (int) first;
                int encryptedSecond = (int) second;
                int encryptedThird = (int) third;

                System.out.printf("%s: %d %d %d%n", tagName, encryptedFirst, encryptedSecond, encryptedThird);


            } else {
                System.out.println("Valid message not found!");
            }
        }

    }
}