package nyc.c4q.jvvlives2005;

import java.net.URL;
/**
 * 1. Write a method that constructs an HTTP URL from the host name,
 * port number, and path. Include the port number only if it is not 80.
 *
 *2. Using overloaded methods, write a similar method that doesn't take a port number,
 * and assumes the port number is 80.

 *3. Write a method that neatly prints out the parts of a URL, in the correct order.
 * Created by c4q-joshelynvivas on 3/22/15.
 */



public class URLexample {
    public static URL makeHttpUrl(String host, int port, String path) {
        String url = "http://" + host;
        if (port != 80)
            url += ":" + port;
        url += path;
        return HTTP.stringToURL(url);
    }

    public static URL makeHttpUrl(String host, String path) {
        return makeHttpUrl(host, 80, path);
    }

    public static void main (String[] args) {
        URL url = makeHttpUrl("github.com", 80, "/accesscode-2-1/unit-0");
        System.out.println(url);

    }

}
