package FinalExamRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> followers = new LinkedHashMap<>();

        while (!input.equals("Log out")) {
            String[] commandLine = input.split(": ");
            String inputLine = commandLine[0];
            String username = commandLine[1];

            switch (inputLine) {
                case "New follower":
                    if (!followers.containsKey(username)) {

                        followers.put(username, 0);
                    }
                    break;
                case "Like":
                    int countLikes = Integer.parseInt(commandLine[2]);
                    if (!followers.containsKey(username)) {
                        followers.put(username, countLikes);

                    } else {
                        followers.put(username, followers.get(username) + countLikes);
                    }
                    break;
                case "Comment":
                    if (!followers.containsKey(username)) {
                        followers.put(username, 1);
                    } else {
                        followers.put(username, followers.get(username) + 1);
                    }
                    break;
                case "Blocked":
                    if (followers.containsKey(username)) {
                        followers.remove(username);
                    } else {
                        System.out.printf("%s doesn't exist.%n", username);
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.printf("%d followers%n", followers.size());

        followers.entrySet().stream().
                forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

    }
}
