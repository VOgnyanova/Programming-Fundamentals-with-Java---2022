package exam04december;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class firstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String encryptedPassword = "([\\W+\\w\\d]+)>(?<firstGroup>[0-9]{3})\\|(?<secondGroup>[a-z]{3})\\|(?<thirdGroup>[A-Z]{3})\\|(?<forthGroup>[^<>]{3})<\\1";

        Pattern pattern = Pattern.compile(encryptedPassword);
        Matcher matcher = null;

        for (int i = 0; i < n; i++) {
            String inputText = scanner.nextLine();
            matcher = pattern.matcher(inputText);

            if (matcher.find()) {
                StringBuilder password = new StringBuilder();

                String firstGroup = matcher.group("firstGroup");
                String secondGroup = matcher.group("secondGroup");
                String thirdGroup = matcher.group("thirdGroup");
                String forthGroup = matcher.group("forthGroup");

                if (!firstGroup.equals("0") && !secondGroup.equals("0") && !thirdGroup.equals("0") && !forthGroup.equals("0")) {
                    password.append(firstGroup).append(secondGroup).append(thirdGroup).append(forthGroup);
                    System.out.printf("Password: %s%n", password);
                } else {
                    System.out.println("Try another password!");
                }
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
