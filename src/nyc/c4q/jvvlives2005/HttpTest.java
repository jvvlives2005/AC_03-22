package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/22/15.
 */
import java.util.Scanner;
import java.net.URL;

public class HttpTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        URL url = HTTP.stringToURL(input);
        String document = HTTP.get(url);

        System.out.println(document);

        if (document.toLowerCase().startsWith("<!doctype html>")){
            System.out.println("This is an HTML Document!");
        }
        else
            System.out.println("This is not an HTML Document!");
    }
}
