package Wordle;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public abstract class WordleAbstract {

    public static String[] getWords(String path) throws IOException{
        String textFile = Files.readString(Paths.get(path));
        String[] words = textFile.split(",");
        return words;
    }

    public final static int SEED = 99;
}
