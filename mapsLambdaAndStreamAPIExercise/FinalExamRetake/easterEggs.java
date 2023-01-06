package FinalExamRetake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class easterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String regex = "[@#]+(?<color>[a-z]{3,})[@#]+[^a-zA-Z0-9]*[\\/]+(?<total>[0-9]+)[\\/]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String total = matcher.group("total");
            String color = matcher.group("color");

            System.out.printf("You found %s %s eggs!", total, color);
        }
    }
}