package listsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            List<String> commandLine = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String input = commandLine.get(0);
            switch (input) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandLine.get(1));
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commandLine.get(1));
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int numberToRemoveAt = Integer.parseInt(commandLine.get(1));
                    numbers.remove(numberToRemoveAt);
                    break;
                case "Insert":
                    int numbersToInsert = Integer.parseInt(commandLine.get(1));
                    int indexToInsert = Integer.parseInt(commandLine.get(2));
                    numbers.add(indexToInsert, numbersToInsert);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}

