package FinalExamRetake;

import java.util.Scanner;

public class decryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String command = scanner.nextLine();

        StringBuilder messageBuilder = new StringBuilder(input);

        while (!command.equals("Finish")) {

            if (command.contains("Replace")) {

                String currentChar = command.split(" ")[1];
                String newChar = command.split(" ")[2];

                String text = messageBuilder.toString();

                String newText = text.replace(currentChar, newChar);
                messageBuilder = new StringBuilder(newText);

                System.out.println(messageBuilder);

            } else if (command.contains("Cut")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                String text = messageBuilder.toString();

                if (startIndex > 0 && startIndex < text.length() && endIndex > 0 && endIndex < text.length()) {


                    messageBuilder.delete(startIndex, endIndex + 1);
                    System.out.println(messageBuilder);
                } else {

                    System.out.println("Invalid indices!");

                }

            } else if (command.contains("Make")) {

                String lowerOrUpper = command.split(" ")[1];
                String message = messageBuilder.toString();
                String newText = "";

                if (command.equals("Upper")) {

                    newText = message.toUpperCase();

                } else if (command.equals("Lower")) {
                    newText = message.toLowerCase();
                }

                messageBuilder = new StringBuilder(newText);
                System.out.println(messageBuilder);

            } else if (command.contains("Check")) {

                String strCheck = command.split(" ")[1];
                String text = messageBuilder.toString();

                if (text.contains(strCheck)) {
                    System.out.printf("Message contains %s%n", strCheck);
                } else {

                    System.out.printf("Message doesn't contain %s%n", strCheck);
                }

            } else if (command.contains("Sum")) {

                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                String text = messageBuilder.toString();

                if (startIndex > 0 && startIndex < text.length() && endIndex > 0 && endIndex < text.length()) {
                    String substring = messageBuilder.substring(startIndex, endIndex + 1);

                    int sum = 0;

                    for (char letter : substring.toCharArray()) {

                        sum += letter;
                    }

                    System.out.println(sum);

                } else {
                    System.out.println("Invalid indices!");

                }

            }

            command = scanner.nextLine();
        }

    }
}