package MIDExamPreparatonDecember;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class friendsList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> namesList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        int blackListedCounter = 0;
        int lostCounter = 0;

        String command = scanner.nextLine();
        while (!command.equals("Report")){
            if (command.contains("Blacklist")){
                String currentName = command.split(" ")[1];
                if (namesList.contains(currentName)){
                    blackListedCounter++;
                    int currentNameIndex = namesList.indexOf(currentName);

                    System.out.printf("%s was blacklisted.%n", currentName);
                    namesList.set(currentNameIndex, "Blacklisted");
                }else {
                    System.out.printf("%s was not found.%n", currentName);
                }

            }else if(command.contains("Error")){
                int index = Integer.parseInt(command.split(" ")[1]);

                if (index < namesList.size()){
                    if (!namesList.get(index).equals("Blacklisted") && !namesList.get(index).equals("Lost")){
                        String currentName = namesList.get(index);
                        namesList.set(index, "Lost");
                        System.out.printf("%s was lost due to an error.%n", currentName);
                        lostCounter++;

                    }
                }

            }else if (command.contains("Change")){
                int currentIndex = Integer.parseInt(command.split(" ")[1]);
                String newName = command.split(" ")[2];

                if (currentIndex < namesList.size()){
                    String currentName = namesList.get(currentIndex);
                    namesList.set(currentIndex, newName);
                    System.out.printf("%s changed his username to %s.%n", currentName, newName);

                }

            }

            command = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n", blackListedCounter);
        System.out.printf("Lost names: %d%n", lostCounter);
        System.out.println(String.join(" ", namesList));

    }
}