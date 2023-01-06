package MIDExamPreparatonDecember;

import java.util.Scanner;

public class bonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudent = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int countLectures = 0;

        for (int i = 0; i < numberOfStudent; i++) {
            int attendanceOfEachStudents = Integer.parseInt(scanner.nextLine());
            double totalBonus = attendanceOfEachStudents * 1.0 / numberOfLectures * (5 + bonus);

            if (maxBonus < totalBonus) {
                maxBonus = totalBonus;
                countLectures = attendanceOfEachStudents;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", countLectures);


    }
}
