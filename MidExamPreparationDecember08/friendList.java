package MidExamPreparationDecember08;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class friendList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friendList = Arrays.stream(scanner.nextLine()
                .split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();
        int counter =0;

        while (!command.equals("Report")) {
            String[] input = command.split(" ");
            String inputLine = input[0];
            switch (inputLine) {
                case "Blacklist":
                    counter++;
                    String nameChange = input[1];
                    if (!friendList.contains(nameChange)) {
                        System.out.printf("%s was not found.%n", nameChange);
                    } else {
                        System.out.printf("%s was blacklisted.%n", nameChange);
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    if (isValidIndex(index, friendList.size())){
                        String name = friendList.get(index);
//                        System.out.printf("%s was lost due to an error.%n",name);

                    }else {
                        System.out.printf("Lost names: %d%n",counter-1);
                    }

                    break;
                case "Change":
                    int indexToChange = Integer.parseInt(command.split(" ")[1]);
                    String newName = command.split(" ")[2];
                    String oldName = friendList.get(indexToChange);
                    if (isValidIndex(indexToChange, friendList.size())){
                        friendList.add(indexToChange,newName);
                        System.out.printf("%s changed his username to %s.%n",oldName,newName);

                    }

                    break;

            }


            command = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n",counter);
        System.out.printf("Lost names: %d%n",counter-1);
        System.out.println(String.join(" ",friendList));
    }

    public static boolean isValidIndex(int index, int sizeOfList) {
        return index >= 0 && index <= sizeOfList-1;
    }
}
