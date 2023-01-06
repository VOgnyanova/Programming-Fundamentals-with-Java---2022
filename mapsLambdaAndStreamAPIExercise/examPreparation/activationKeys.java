package examPreparation;


import java.util.Scanner;

public class activationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String[] tokens = command.split(">>>");
            String commandLine = tokens[0];
            int startIndex = 0;
            int endIndex = 0;
            String substring = "";
            switch (commandLine) {
                case "Contains":
                    substring = tokens[1];

                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);

                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = tokens[1];
                    startIndex = Integer.parseInt(tokens[2]);
                    endIndex = Integer.parseInt(tokens[3]);
                    substring = activationKey.substring(startIndex, endIndex);
                    if (upperOrLower.equals("Upper")) {
                        activationKey = activationKey.replace(substring, substring.toUpperCase());

                    } else {
                        activationKey = activationKey.replace(substring, substring.toLowerCase());
                    }
                    System.out.println(activationKey);

                    break;
                case "Slice":
                    startIndex = Integer.parseInt(tokens[1]);
                    endIndex = Integer.parseInt(tokens[2]);
                    substring = activationKey.substring(startIndex, endIndex);

                    activationKey = activationKey.replace(substring, "");

                    System.out.println(activationKey);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);


    }
}
