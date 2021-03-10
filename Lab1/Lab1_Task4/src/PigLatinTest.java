import java.util.Locale;
import java.util.Scanner;

public class PigLatinTest {
    public static void main(String[] args){
        pigLatinTranslator();
    }

    public static void pigLatinTranslator(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a word: ");
        String word = scan.nextLine();

        String lowerWord = word.toLowerCase(Locale.ROOT);
        String trimlowerWord = lowerWord.trim();

        String Result;

        if(trimlowerWord == null || trimlowerWord.length() == 0){
            Result = "Invalid word!";
        }
        else{
            switch (trimlowerWord.charAt(0)){
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    Result = trimlowerWord + "hay";
                    System.out.println(Result);
                    break;
                default:
                    Result = trimlowerWord.substring(1,trimlowerWord.length()) + trimlowerWord.charAt(0) + "ay";
                    System.out.println(Result);
                    break;
            }
        }
    }
}
