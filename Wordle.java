import java.util.Scanner;
import java.io.IOException;
import java.util.Random;


public class Wordle extends WordleAbstract{

    public static String genWord(String s) throws IOException{
        Random r = new Random();

        int n = r.nextInt(getWord(s).length);
        String word = getWord(s)[n];
        return word;
    }

    public static void main(String[] args) throws IOException{
        String answer = genWord(args[0]);
        Scanner s = new Scanner(System.in);

    }

    
}

