package exam04december;

import java.util.*;

public class secondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        Map<String, Integer> followersMap = new LinkedHashMap<>();

        while (!command.equals("Log out")) {
            String[] commandLine = command.split(": ");
            String input = commandLine[0];
            String username = commandLine[1];

            if (input.equals("New follower")) {
                if (!followersMap.containsKey(username)) {
                    followersMap.put(username, 0);
                }

            } else if (input.equals("Like")) {

                int countLikes = Integer.parseInt(commandLine[2]);
                if (!followersMap.containsKey(username)) {
                    followersMap.put(username, countLikes);

                } else {
                    followersMap.put(username, followersMap.get(username) + countLikes);
                }

            } else if (input.equals("Comment")) {

                if (!followersMap.containsKey(username)) {
                    followersMap.put(username, 1);
                } else {
                    followersMap.put(username, followersMap.get(username) + 1);
                }

            } else if (input.equals("Blocked")) {

                if (followersMap.containsKey(username)) {
                    followersMap.remove(username);
                } else {
                    System.out.printf("%s doesn't exist.%n", username);
                }

            }

            command = scanner.nextLine();
        }
        System.out.printf("%d followers%n", followersMap.size());

        followersMap.entrySet().stream()
                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

    }
}
