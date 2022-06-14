import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public abstract class WordleAbstract {

    public static final int EXIT_WIN = 0;
    public static final int EXIT_LOSE = -1;

    public static String[] getWord(String path) throws IOException{
        String textFile = Files.readString(Paths.get(path));
        String[] words = textFile.split(",");
        return words;
    }

    public static int printField(String answer, String move, int guess){
          
        return EXIT_WIN;
    }
}
