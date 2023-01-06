package FinalExamRetake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class encryptingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String encryptedPassword = "([\\W+\\w\\d]+)>(?<firstGroup>[0-9]{3})\\|(?<secondGroup>[a-z]{3})\\|(?<thirdGroup>[A-Z]{3})\\|(?<forthGroup>[^<>]{3})<\\1";

        Pattern pattern = Pattern.compile(encryptedPassword);
        Matcher matcher = null;

        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();
            matcher = pattern.matcher(password);

            if (matcher.find()) {
                StringBuilder newPassword = new StringBuilder();

                String firstGroup = matcher.group("firstGroup");
                String secondGroup = matcher.group("secondGroup");
                String thirdGroup = matcher.group("thirdGroup");
                String forthGroup = matcher.group("forthGroup");

                newPassword.append(firstGroup);
                newPassword.append(secondGroup);
                newPassword.append(thirdGroup);
                newPassword.append(forthGroup);
                System.out.println("Password: " + newPassword);
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
