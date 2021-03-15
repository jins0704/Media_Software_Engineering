package Task4;

import java.util.Locale;
import java.util.Scanner;

public class PigLatinTest {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Give a word: ");
        String word = scan.nextLine();

        pigLatinTranslator(word);
    }

    private static void pigLatinTranslator(String word){

        String lowerWord = word.toLowerCase();
        String trimLowerWord = lowerWord.trim();
        String Result;

        if(trimLowerWord == null || trimLowerWord.length() == 0) {
            Result = "Invalid word!";
        }
        else{
            switch (trimLowerWord.charAt(0)){
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    Result = trimLowerWord + "hay";
                    break;
                default:
                    Result = trimLowerWord.substring(1,trimLowerWord.length()) + trimLowerWord.charAt(0) + "ay";
                    break;
            }
        }
        System.out.println("Result : " + Result);
    }
}
