package dataTypeAndVariablesExercise;

import java.util.Scanner;

public class printPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstLetter = Integer.parseInt(scanner.nextLine());
        int lastLetter = Integer.parseInt(scanner.nextLine());

        for (int i = firstLetter; i <= lastLetter; i++) {

            System.out.print((char) i + " ");


        }
    }

}