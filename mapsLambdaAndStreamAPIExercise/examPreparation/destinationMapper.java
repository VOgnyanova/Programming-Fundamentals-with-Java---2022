package examPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class destinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String location = scanner.nextLine();


        String regex = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(location);

        int travelPoints = 0;
        List<String> destinationList = new ArrayList<>();
        while (matcher.find()) {
            String destination = matcher.group("destination");
            travelPoints = travelPoints + destination.length();

            destinationList.add(destination);

        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinationList));
        System.out.printf("Travel Points: %d", travelPoints);
    }
}
