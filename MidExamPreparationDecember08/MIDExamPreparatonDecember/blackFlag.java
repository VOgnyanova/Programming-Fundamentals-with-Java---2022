package MIDExamPreparatonDecember;

import java.util.Scanner;

public class blackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        int countDays = 0;
        double totalPlunder = 0;


        while (countDays < days) {
            totalPlunder += dailyPlunder;
            countDays++;

            if (countDays % 3 == 0) {
                totalPlunder += dailyPlunder * 0.50;

            }
            if (countDays % 5 == 0) {
                totalPlunder = totalPlunder * 0.70;
            }
        }
        if (totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", totalPlunder / expectedPlunder * 100);
        }


    }
}
