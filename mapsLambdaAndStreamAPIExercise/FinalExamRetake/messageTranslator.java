package FinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class messageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<translator>[A-Za-z]+)\\]";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            Matcher matcher = pattern.matcher(message);

            if (matcher.find()) {
                List<Integer> integerList = new ArrayList<>();

                System.out.printf("%s: ", matcher.group("command"));
                String translator = matcher.group("translator");
                for (int j = 0; j < translator.length(); j++) {
                    char symbol = translator.toCharArray()[j];
                    int asci = (int) symbol;
                    integerList.add(asci);
                }
                System.out.println(String.join(" ", integerList.toString()).replaceAll("[\\[,\\]]", ""));
            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}