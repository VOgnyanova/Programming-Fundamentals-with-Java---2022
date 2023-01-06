package finalExam;

import java.util.Scanner;

public class theImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();


        while (!input.equals("Decode")) {
            String inputCommand = input.split("\\|")[0];
            switch (inputCommand) {
                case "ChangeAll":
                    String substring = input.split("\\|")[1];
                    String replacement = input.split("\\|")[2];
                    String newWord = message.toString().replace(substring, replacement);
                    message = new StringBuilder(newWord);
                    break;

                case "Move":
                    int moveCharacters = Integer.parseInt(input.split("\\|")[1]);
                    String newString = (message.substring(moveCharacters)).concat(message.substring(0, moveCharacters));
                    message = new StringBuilder(newString);
                    break;
                case "Insert":
                    int index = Integer.parseInt(input.split("\\|")[1]);
                    String value = input.split("\\|")[2];
                    String insertString = message.substring(0, index).concat(value).concat(message.substring(index));
                    message = new StringBuilder(insertString);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);


    }
}
