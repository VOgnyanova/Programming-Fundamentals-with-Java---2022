package MIDExamPreparatonDecember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class weaponsmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String commands = scanner.nextLine();
        List<String> inputList = Arrays.stream(input.split("\\|")).collect(Collectors.toList());


        List<String> evenList = new ArrayList<>();
        List<String> oddList = new ArrayList<>();

        while (!commands.equals("Done")) {

            List<String> commandList = Arrays.stream(commands.split(" ")).collect(Collectors.toList());
            String command = commandList.get(0);
            switch (command) {
                case "Add":
                    String particle = commandList.get(1);
                    int index = Integer.parseInt(commandList.get(2));
                    if (index >= 0 && index < inputList.size()) {
                        inputList.add(index, particle);
                    }
                    break;

                case "Remove":
                    int index2 = Integer.parseInt(commandList.get(1));

                    if (index2 >= 0 && index2 < inputList.size()) {
                        inputList.remove(index2);
                    }
                    break;

                case "Check":
                    String command2 = commandList.get(1);
                    if (command2.equals("Even")) {
                        for (int i = 0; i < inputList.size(); i++) {
                            if (i % 2 != 0) {
                                String evenNumber = inputList.get(i);
                              evenList.add(evenNumber);
                            }
                        }
                        for (String itemEven : evenList) {

                        }
                        System.out.println();
                        for (int n = evenList.size() - 1; n >= 0; n--) {

                            evenList.remove(n);
                        }

                    } else if (command2.equals("Odd")) {
                        for (int j = 0; j < inputList.size(); j++) {
                            if (j % 2 == 0) {
                                String oddNumber = inputList.get(j);
                                oddList.add(oddNumber);
                            }

                        }
                        System.out.println();
                        for (int n = oddList.size() - 1; n >= 0; n--) {

                        }
                    }
                    break;

            }

            commands = scanner.nextLine();


        }
        System.out.println("Do ha er");
        System.out.println();
        System.out.print("You crafted ");
        System.out.println(inputList.toString().replaceAll("[\\[\\]\\ ,]", ""));
    }

}