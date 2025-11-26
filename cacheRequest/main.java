// Java Program to illustrate CacheRequest Class
// java.net package

// Importing IOException class from
// java,io package
import java.io.IOException;
// Importing all classes from java.net package package
// to create an applet to run on anetwork
import java.net.*;
// Importing List and Map classes from
// java.util package
import java.util.List;
import java.util.Map;

// Main class
public class GFG {

    // Main driver method
    public static void main(String args[]) throws Exception
    {

        // Passing the string uri
        String ur = "https://www.geeksforgeeks.org";

        // Now, calling the constructor of the URI class
        URI ur1 = new URI(ur);

        // Passing the url
        URL url = new URL(
            "https://www.geeksforgeeks.org/category/java-programs/");

        // Now, calling the constructor of the URLConnection
        URLConnection uc = url.openConnection();

        ResponseCache responseCache = new ResponseCache() {
            // Calling the abstract methods
            public CacheResponse get(
                URI ur, String reqMethod,
                Map<String, List<String> > rqstHeaders
                )
                throws IOException
            {
                return null;
            }

            @Override
            public CacheRequest put(URI ur,
                                    URLConnection conn)
                throws IOException
            {
                return null;
            }
        };

        // Display message only
        System.out.println(
            "The put() method has been initiated and called Successfully!");

        // The put() method returns the
        // CacheRequest for recording
        System.out.println("The put() method returns: "
                           + responseCache.put(ur1, uc));
    }
}