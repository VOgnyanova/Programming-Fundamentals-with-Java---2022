package examPreparation;

import java.util.Scanner;

public class passwordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            if (command.equals("TakeOdd")) {
                password = getCharsOnOddPositions(password);
                System.out.println(password);

            } else if (command.contains("Cut")) {

                int index = Integer.parseInt(command.split("\\s+")[1]);
                int length = Integer.parseInt(command.split("\\s+")[2]);

                String substringToRemove = password.substring(index, index + length);
                password = password.replaceFirst(substringToRemove, "");
                System.out.println(password);
            } else if (command.contains("Substitute")) {

                String substring = command.split("\\s+")[1];
                String substitute = command.split("\\s+")[2];

                if (password.contains(substring)) {

                    password = password.replaceAll(substring, substitute);
                    System.out.println(password);
                } else {

                    System.out.println("Nothing to replace!");
                }

            }
            command = scanner.nextLine();
        }

        System.out.println("Your password is: " + password);
    }

    private static String getCharsOnOddPositions(String password) {

        StringBuilder newPassword = new StringBuilder();


        for (int position = 0; position <= password.length() - 1; position++) {

            if (position % 2 != 0) {

                char currentSymbol = password.charAt(position);
                newPassword.append(currentSymbol);
            }
        }

        return newPassword.toString();
    }
}
