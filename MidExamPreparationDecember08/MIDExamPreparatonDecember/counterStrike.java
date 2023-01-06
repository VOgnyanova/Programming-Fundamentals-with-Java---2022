package MIDExamPreparatonDecember;

import java.util.Scanner;

public class counterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int wontBattle = 0;
        boolean isLost = false;

        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
            if (initialEnergy >= distance) {
                initialEnergy -= distance;
                wontBattle++;
            } else {
                isLost = true;
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wontBattle, initialEnergy);
                break;
            }

            if (wontBattle % 3 == 0) {
                initialEnergy += wontBattle;

            }
            command = scanner.nextLine();
        }
        if (!isLost) {
            System.out.printf("Won battles: %d. Energy left: %d", wontBattle, initialEnergy);
        }

    }
}