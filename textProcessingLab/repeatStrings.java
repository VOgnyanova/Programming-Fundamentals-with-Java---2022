package textProcessingLab;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");


        List<String> repeatList = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int length = currentWord.length();
            String repeatWord = repeatString(currentWord,length);

            repeatList.add(repeatWord);

        }

        System.out.println(String.join("",repeatList));

    }
    public static String repeatString(String word,int length){
        String result = "";
        for(int i = 0; i < length; i++) {
            result = result + word;

        }
        return result;
    }

}

