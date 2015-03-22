package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/22/15.
 */
public class CaesarCipher {
    public static String rot13(String value) {


        for (int i = 0; i < value.length(); i++) {
           
            char letter;
            int values = (int) value.charAt(i);

            if (values >= 97 && values <= 122) {
                // Rotate lowercase values.

                if (values > 109) {
                    values -= 13;
                } else {
                    values += 13;
                }
            } else if (values >= 65 && values <= 90) {
                // Rotate uppercase valuess.

                if (values > 77) {
                    values -= 13;
                } else {
                    values += 13;
                }
            }
           System.out.print((char) values);
        }
        
        return new String();
    }

    public static void main(String[] args) {

        // Rotate the input string.
        // ... Then rotate the rotated string.
        String input = "Do you have any cat pictures?";
        String rot13 = rot13(input);
        String roundTrip = rot13(rot13);

        System.out.println(" ");
        System.out.println(input);
        System.out.println(rot13);
        System.out.println(roundTrip);
    }
}


