package examPreparation;

import java.util.Scanner;

public class worldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(stops);

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Travel")) {

            if (inputLine.contains("Add Stop")) {

                int index = Integer.parseInt(inputLine.split(":")[1]);
                String stopName = inputLine.split(":")[2];

                if (isValidIndex(index, stopsBuilder)) {
                    stopsBuilder.insert(index, stopName);
                }
            } else if (inputLine.contains("Remove Stop")) {

                int startIndex = Integer.parseInt(inputLine.split(":")[1]);
                int endIndex = Integer.parseInt(inputLine.split(":")[2]);

                if (isValidIndex(startIndex, stopsBuilder) && isValidIndex(endIndex, stopsBuilder)) {
                    stopsBuilder.delete(startIndex, endIndex + 1);
                }
            } else if (inputLine.contains("Switch")) {

                String oldStop = inputLine.split(":")[1];
                String newStop = inputLine.split(":")[2];

                if (stops.contains(oldStop)) {
                    String updatedText = stopsBuilder.toString().replace(oldStop, newStop);
                    stopsBuilder = new StringBuilder(updatedText);
                }
            }

            System.out.println(stopsBuilder);
            inputLine = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + stopsBuilder);
    }


    public static boolean isValidIndex(int index, StringBuilder builder) {
        return index >= 0 && index <= builder.length() - 1;
    }
}