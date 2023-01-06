package FinalExamRetake;

import java.util.*;

public class degustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> guestMap = new LinkedHashMap<>();

        int counter = 0;

        String[] input = command.split("-");
        String guest = input[1];
        String meal = input[2];

        while (!command.equals("Stop")) {

            if (command.contains("Like")) {
                if (!guestMap.containsKey(guest)) {
                    guestMap.put(guest, new ArrayList<>());
                }
                if (!guestMap.get(guest).contains(meal)) {
                    guestMap.get(guest).add(meal);
                } else if (guestMap.get(guest).contains(meal)) {
                    continue;
                }

            } else if (command.contains("Dislike")) {

                if (guestMap.get(guest).contains(meal)) {
                    counter++;
                    guestMap.get(guest).remove(meal);

                    System.out.printf("%s doesn't like the %s.%n", guest, meal);
                } else if (!guestMap.containsKey(guest)) {
                    System.out.printf("%s is not at the party.%n", guest);
                } else if (!guestMap.get(guest).contains(meal)) {
                    System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                }
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : guestMap.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), String.join(", ", entry.getValue()));

        }
        System.out.printf("Unliked meals: %d", counter);
    }
}