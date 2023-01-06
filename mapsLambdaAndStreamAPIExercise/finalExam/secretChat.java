package finalExam;

import java.util.Scanner;

public class secretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();
        StringBuilder message = new StringBuilder(concealedMessage);
        String command = scanner.nextLine();


        while (!command.equals("Reveal")) {
            String commandLine = command.split(":\\|:")[0];
            String textToEdit = message.toString();
            switch (commandLine) {
                case "InsertSpace":
                    int index = Integer.parseInt(command.split(":\\|:")[1]);
                    message = new StringBuilder(textToEdit.substring(0, index).concat(" ").concat(textToEdit.substring(index)));
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substringToReverse = command.split(":\\|:")[1];

                    if (textToEdit.contains(substringToReverse)) {
                        String reverse = new StringBuilder(substringToReverse).reverse().toString();
                        message.delete(message.indexOf(substringToReverse), message.indexOf(substringToReverse) + substringToReverse.length());
                        message.append(reverse);
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substring = command.split(":\\|:")[1];
                    String replacement = command.split(":\\|:")[2];
                    while (textToEdit.contains(substring)) {
                        textToEdit = textToEdit.replace(substring, replacement);
                    }
                    message = new StringBuilder(textToEdit);
                    System.out.println(message);
                    break;
            }


            command = scanner.nextLine();

        }
        System.out.println("You have a new text message: " + message);


    }
}