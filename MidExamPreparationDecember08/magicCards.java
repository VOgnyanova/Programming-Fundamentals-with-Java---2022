package MidExamPreparationDecember08;

import java.util.*;
import java.util.stream.Collectors;

public class magicCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> oldDeck = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());
        List<String> newDeck = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("Ready")) {
            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {
                    case "Add":
                        String addCards = commandParts[1];
                        if (oldDeck.contains(addCards)) {
                            newDeck.add(addCards);
                        } else {

                            System.out.println("Card not found.");
                        }
                        break;
                    case "Insert":
                        int indexCard = Integer.parseInt(commandParts[2]);
                        String insertCard =commandParts[1];
                        if (!isIndexValid(indexCard, oldDeck.size())) {
                        } else if (oldDeck.contains(insertCard)) {
                            newDeck.add(indexCard, insertCard);

                        }else {
                            System.out.println("Error!");
                        }
                        break;

                    case "Remove":
                        String removeCards =commandParts[1];
                        if (newDeck.contains(removeCards)) {
                           newDeck.remove(removeCards);
                        } else {
                            System.out.println("Card not found.");
                        }
                        break;
                    case "Swap":


                      Collections.swap(newDeck, 0, 1);


                        break;
                    case "Shuffle deck":
                        for (int k = 0, j = newDeck.size() - 1; k < j; k++)
                        {
                           newDeck.add(k,newDeck.remove(j));
                        }

                        break;
                }
                command = scanner.nextLine();

            }

        System.out.println(newDeck.toString().replaceAll("[\\[\\],]", ""));
        }

    private static boolean isIndexValid(int index, int sizeOfList) {
        return index >= 0 && index <= sizeOfList - 1;
    }

}