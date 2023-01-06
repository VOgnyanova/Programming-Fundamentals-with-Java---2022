package opinionPoll;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            String personalData = scanner.nextLine();
            String personName = personalData.split(" ")[0];
            int personAge = Integer.parseInt(personalData.split(" ")[1]);

            if (personAge > 30) {
                System.out.println(personName + " - " + personAge);
            }


        }
    }
}
