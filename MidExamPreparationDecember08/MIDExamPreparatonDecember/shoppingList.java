package MIDExamPreparatonDecember;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] inputLine = command.split(" ");
            String input = inputLine[0];

            switch (input) {
                case "Urgent":
                    String addProduct = inputLine[1];
                    if (!shoppingList.contains(addProduct)) {
                        shoppingList.add(0, addProduct);
                    }
                    break;
                case "Unnecessary":
                    String removeProduct = inputLine[1];
                    shoppingList.remove(removeProduct);

                    break;
                case "Correct":
                    String oldProduct = inputLine[1];
                    String newProduct = inputLine[2];
                    if (shoppingList.contains(oldProduct)) {
                        for (int i = 0; i < shoppingList.size(); i++) {
                            if (shoppingList.get(i).equals(oldProduct))
                                shoppingList.set(i, newProduct);
                        }
                    }

                    break;
                case "Rearrange":
                    String rearrangeProduct = inputLine[1];
                    if (shoppingList.contains(rearrangeProduct)) {
                        for (int i = 0; i < shoppingList.size(); i++) {
                            if (shoppingList.get(i).equals(rearrangeProduct)) {
                                String newItem = shoppingList.get(i);
                                shoppingList.remove(i);
                                shoppingList.add(newItem);
                            }
                        }
                    }
                    break;

            }

            command = scanner.nextLine();


        }

        System.out.println(String.join(", ", shoppingList));
    }

}
