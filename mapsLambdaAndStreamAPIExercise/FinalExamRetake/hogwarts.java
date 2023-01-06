package FinalExamRetake;

import java.util.Scanner;

public class hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Abracadabra")) {
            String[] command = input.split("\\s+");
            String commandLine = command[0];

            switch (commandLine) {
                case "Abjuration":
                    String current = message.toString().toUpperCase();
                    message = new StringBuilder(current);
                    System.out.println(message);
                    break;
                case "Necromancy":
                    String currentLower = message.toString().toLowerCase();
                    message = new StringBuilder(currentLower);
                    System.out.println(message);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(command[1]);
                    String letter = command[2];

                    if (index >= 0 && index < message.length()) {
                        message.replace(index, index + 1, letter);
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String first = command[1];
                    String second = command[2];

                    String currentMessage = message.toString();
                    if (currentMessage.contains(first)) {
                        currentMessage = currentMessage.replace(first, second);
                        message = new StringBuilder(currentMessage);
                        System.out.println(message);
                    }
                    break;
                case "Alteration":
                    String substring = command[1];

                    if (message.toString().contains(substring)) {
                        String messageRes = message.toString().replace(substring, "");
                        message = new StringBuilder(messageRes);
                        System.out.println(messageRes);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
            }

            input = scanner.nextLine();
        }
    }
}
