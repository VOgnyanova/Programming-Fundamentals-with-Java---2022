package textProcessingLab;

import java.util.Scanner;

public class textFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String wordBan : banWordsArr){
            text = text.replace(wordBan,repeatString("*",wordBan.length()));
        }

        System.out.println(text);

    }
    public static String repeatString(String s,int count){
        String result = "";
        for(int i = 0; i < count; i++) {
            result  += s;
        }
        return result;
    }
}
