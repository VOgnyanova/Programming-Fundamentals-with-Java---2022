package MIDExamPreparatonDecember;

import java.util.Scanner;

public class softUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employer1 = Integer.parseInt(scanner.nextLine());
        int employer2 = Integer.parseInt(scanner.nextLine());
        int employer3 = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int hours = 0;

        int studentsPerHour = employer1 + employer2 + employer3;

        while (studentsCount > 0) {
            studentsCount -= studentsPerHour;
            hours++;

            if (hours % 4 == 0) {
                hours++;
            }
        }

        System.out.printf("Time needed: %dh.", hours);

    }
}

