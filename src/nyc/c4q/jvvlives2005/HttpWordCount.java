package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/22/15.
 */
import java.util.Scanner;
import java.net.URL;

public class HttpWordCount {

    public static int countWords(String text, String word){
        text = text.toLowerCase();
        word = word.toLowerCase();

        int count = 0;
        int i = text.indexOf(word);
        while (i != -1) {
            count ++;
            i = text.indexOf(word, i + word.length());

        }
        return count;
    }

    public static void main(String[] args) {
        URL url = HTTP.stringToURL("http://alexsamuel.net/AliceInWonderland.txt");
        String document = HTTP.get(url);
        System.out.println(countWords(document, "Alice"));

            /*Scanner in = new Scanner(System.in);
            String searchWord = in.next();
            char searchChar = searchWord.charAt(0);
            System.out.println("Enter URL: ");

            System.out.println("Enter word: ");
            System.out.println("The words occur" + "times in the document");*/



    }
}

