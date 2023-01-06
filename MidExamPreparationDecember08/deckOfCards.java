package MidExamPreparationDecember08;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class deckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> carsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] commandLine = command.split(", ");
            String input = commandLine[0];

            switch (input) {
                case "Add":
                    String addCards = commandLine[1];
                    if (!carsList.contains(addCards)) {
                        carsList.add(addCards);
                        System.out.println("Card successfully added");
                    } else {

                        System.out.println("Card is already in the deck");
                    }
                    break;

                case "Remove":
                    String removeCards = commandLine[1];
                    if (carsList.contains(removeCards)) {
                        carsList.remove(removeCards);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;

                case "Remove At":
                    int removeAddCard = Integer.parseInt(command.split(", ")[1]);
                    if (isIndexValid(removeAddCard, carsList.size())) {
                        carsList.remove(removeAddCard);
                        System.out.println("Card successfully removed");

                    } else {
                        System.out.println("Index out of range");
                    }

                    break;
                case "Insert":
                    int indexCard = Integer.parseInt(command.split(", ")[1]);
                    String insertCard = commandLine[2];
                    if (!isIndexValid(indexCard, carsList.size())) {
                        System.out.println("Index out of range");
                    } else if (!carsList.contains(insertCard)) {
                        carsList.add(indexCard, insertCard);
                        System.out.println("Card successfully added");

                    } else {
                        System.out.println("Card is already added");
                    }
                    break;
            }


        }
        System.out.println(String.join(", ", carsList));


    }

    private static boolean isIndexValid(int index, int sizeOfList) {
        return index >= 0 && index <= sizeOfList - 1;
    }
}