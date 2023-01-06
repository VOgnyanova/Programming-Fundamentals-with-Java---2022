package finalExam;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command;

        String[] commandParts;
        Map<String, int[]> map = new TreeMap<>();

        while (!"Sail".equals(command = scanner.nextLine())) {
            commandParts = command.split("(\\s+)?(\\|{2})(\\s+)?");
            String town = commandParts[0];
            int population = Integer.parseInt(commandParts[1]);
            int gold = Integer.parseInt(commandParts[2]);

            map.putIfAbsent(town, new int[2]);
            map.get(town)[0] += population;
            map.get(town)[1] += gold;
        }

        while (!"End".equals(command = scanner.nextLine())) {
            commandParts = command.split("(\\s+)?(=>)(\\s+)?");
            String events = commandParts[0];
            String city = commandParts[1];

            switch (events) {
                case "Plunder":
                    int people = Integer.parseInt(commandParts[2]);
                    int gold = Integer.parseInt(commandParts[3]);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city,
                            gold, people);
                    map.get(city)[0] -= people;
                    map.get(city)[1] -= gold;
                    if (map.get(city)[0] == 0 || map.get(city)[1] == 0) {
                        map.remove(city);
                        System.out.printf("%s has been wiped off the map!%n", city);
                    }
                    break;
                case "Prosper":
                    gold = Integer.parseInt(commandParts[2]);

                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        map.get(city)[1] += gold;
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                gold, city, map.get(city)[1]);
                    }
                    break;
                default:
                    break;
            }
        }

        if (map.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", map.size());
            map.entrySet()
                    .stream()
                    .sorted((a, b) -> Integer.compare(b.getValue()[1], a.getValue()[1]))
                    .forEach(e -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                            e.getKey(), e.getValue()[0], e.getValue()[1]));
        }
    }
}