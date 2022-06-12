package Wordle;
import java.util.Scanner;
import java.util.Random;


public class Wordle extends WordleAbstract{

    public static String genWord(){
        String toReturn = "";
        Random r = new Random(SEED);

        int n = r.nextInt(words.size());
        String word = words.get(n);
        System.out.println(word);
        return toReturn;
    }

    public static void main(String[] args){
        genWord();
    }
}

