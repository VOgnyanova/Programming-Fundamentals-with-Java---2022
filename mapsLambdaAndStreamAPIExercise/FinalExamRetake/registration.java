package FinalExamRetake;

import java.util.Scanner;

public class registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        StringBuilder sb = new StringBuilder(username);

        String command = scanner.nextLine();
        while(!command.equals("Registration")) {

            String[] commandLine  = command.split(" ");

            switch (commandLine[0]) {
                case "Letters":
                    String lowerOrUpper = commandLine[1];
                    if (lowerOrUpper.contains("Lower")) {
                        String newName = sb.toString().toLowerCase();
                        sb.replace(0, sb.length(),newName);
                        System.out.println(newName);
                    }else {
                        String newName2 = sb.toString().toUpperCase();
                        sb.replace(0, sb.length(),newName2);
                        System.out.println(newName2);
                    }
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(commandLine[1]);
                    int endIndex  = Integer.parseInt(commandLine[2]);
                    if (startIndex >= 0 && endIndex <= sb.length()) {
                        String newName = username;
                        newName = newName.substring(startIndex,endIndex + 1);
                        StringBuilder sb1 = new StringBuilder(newName);
                        sb1 = sb1.reverse();
                        newName = sb1.toString();
                        System.out.println(newName);
                    }
                    break;
                case "Substring" :
                    String substring  = commandLine[1];
                    if (sb.toString().contains(substring)) {
                        StringBuilder newSb  = new StringBuilder(sb.toString().replace(substring,""));
                        sb = newSb;
                        System.out.println(newSb);
                    }else{
                        System.out.printf("The username %s doesn't contain %s.%n",sb,substring);
                    }
                    break;
                case "Replace":
                    String symbol = commandLine[1];
                    StringBuilder newSb1 = new StringBuilder(sb.toString().replace(symbol,"-"));
                    sb  = newSb1;
                    System.out.println(sb);
                    break;
                case "IsValid" :
                    String symbol1 = commandLine[1];
                    if (sb.toString().contains(symbol1)) {
                        System.out.println("Valid username");
                    }else{
                        username = symbol1;
                        System.out.printf("%s must be contained in your username.%n",username);
                    }
            }


            command = scanner.nextLine();
        }
    }
}
