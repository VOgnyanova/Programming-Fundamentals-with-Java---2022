package mapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedHashMap<String, Integer> commandLine = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());
            commandLine.putIfAbsent(resource, 0);
            int currentQuantity = commandLine.get(resource);
            commandLine.put(resource, currentQuantity + quantity);

            command = scanner.nextLine();

        }
        for (Map.Entry<String, Integer> entry : commandLine.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}