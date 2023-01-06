package MIDExamPreparatonDecember;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class movingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> movingTarget = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] input = command.split(" ");
            String commandLine = input[0];
            switch (commandLine) {

            }


            command = scanner.nextLine();
        }

    }
}
