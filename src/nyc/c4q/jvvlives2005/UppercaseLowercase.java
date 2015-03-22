package nyc.c4q.jvvlives2005;

import java.util.Scanner;

/**
 *
 * CAESAR CIPHER!!!
 * Created by c4q-joshelynvivas on 3/22/15.
 */
public class UppercaseLowercase {
    public static boolean isLowerCaseLetter(char c) {
        int code = (int) c;
        return code >= 97 && code <= 122;
    }

    public static boolean isUpperCaseLetter(char c) {
        int code = (int) c;
        return code >= 65 && code <= 90;
    }

    public static String rot13Encode(String string) {
        String result = "";
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (isLowerCaseLetter(c)) {
                int code = (int) c + 13;
                if (code > 122)
                    code -= 26;
                result += (char) code;
            }
            else if (isUpperCaseLetter(c)) {
                int code = (int) c + 13;
                if (code > 90)
                    code -= 26;
                result += (char) code;
            }
            else {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(rot13Encode(input));
    }
}
