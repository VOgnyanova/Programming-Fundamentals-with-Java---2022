package MIDExamPreparatonDecember;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> shotArray = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        int counter = 0;

        while (!command.equals("End")) {
                int index = Integer.parseInt(command);


                command = scanner.nextLine();
            }
        }
    }
