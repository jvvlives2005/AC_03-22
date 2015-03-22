package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/22/15.
 */
public class ASCII {

    public static void main(String[] args){
        String greeting = "Hello, world!";

        for (int i = 0; i < greeting.length(); i++) {
            char c = greeting.charAt(i);
            int code = (int) c;        // have c (can be anything) equal/cast "int"
            System.out.println("char " + c + " = " + code);


        }
    }

    public static void casts() {

        double pi = 3.14159;
        int mostOfPi = (int) pi;

        int x = 42;
        double y = (double) x;  // or double y = x;
    }
}

