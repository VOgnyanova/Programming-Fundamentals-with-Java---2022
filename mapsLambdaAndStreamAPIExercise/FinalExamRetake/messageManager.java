package FinalExamRetake;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class messageManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        HashMap<String, Integer> userSentMessages = new HashMap<>();
        HashMap<String, Integer> userReceivedMessages = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Statistics")) {
            String[] tokens = input.split("=");

            switch (tokens[0]) {
                case "Add":
                    String username = tokens[1];
                    int sent = Integer.parseInt(tokens[2]);
                    int received = Integer.parseInt(tokens[3]);

                    if (!userSentMessages.containsKey(username)) {
                        userSentMessages.put(username, sent);
                        userReceivedMessages.put(username, received);
                    }
                    break;
                case "Message":
                    String sender = tokens[1];
                    String receiver = tokens[2];

                    if (userSentMessages.containsKey(sender) && userReceivedMessages.containsKey(receiver)) {
                        userSentMessages.put(sender, userSentMessages.get(sender) + 1);
                        userReceivedMessages.put(receiver, userReceivedMessages.get(receiver) + 1);

                        if (userSentMessages.get(sender) + userReceivedMessages.get(sender) >= capacity) {
                            System.out.println(String.format("%s reached the capacity!", sender));
                            userSentMessages.remove(sender);
                            userReceivedMessages.remove(sender);
                        }

                        if (userSentMessages.get(receiver) + userReceivedMessages.get(receiver) >= capacity) {
                            System.out.println(String.format("%s reached the capacity!", receiver));
                            userSentMessages.remove(receiver);
                            userReceivedMessages.remove(receiver);
                        }
                    }
                    break;
                case "Empty":
                    String usernameEmpty = tokens[1];

                    if ("All".equals(usernameEmpty)) {
                        userSentMessages.clear();
                        userReceivedMessages.clear();
                    } else {
                        userSentMessages.remove(usernameEmpty);
                        userReceivedMessages.remove(usernameEmpty);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Users count: %d%n", (userSentMessages.size() + userReceivedMessages.size()) / 2);

        userReceivedMessages.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed().thenComparing(Map.Entry::getKey))
                .forEach(e -> {
                    int sentAndReceivedMessages = userSentMessages.get(e.getKey())
                            + userReceivedMessages.get(e.getKey());
                    System.out.printf("%s - %d%n", e.getKey(), sentAndReceivedMessages);
                });
    }
}