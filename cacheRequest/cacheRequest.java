import java.io.IOException;
import java.net.*;
import java.util.*;

public class GFG{

    public static void main(String [] args) throws Exception{

        String ur = "https://www.geeksforgeeks.org";
        //constructor of URI class
        URI ur1 = new URI(ur);

        //passing url
        URL url = new URL("https://www.geeksforgeeks.org/java-programs/");

        //constructor of the URL connection
        URLConnection uc = url.openConnection();

        ResponseCache responseCache = new ResponseCache() {
            
            public CacheResponse get(
                URI ur, String reqMethod, 
                Map<String, List<String>> rqstHeaders
            )throws IOException{
                return null;
            }

            @Override
            public CacheRequest put(
                URI ur, URLConnection conn
            )throws IOException{
                return null;
            }
        };

        //Display messaga only
        System.out.println("The put() method has been initiated and called Successfully!");

        //The put() method return the CacheRequesr for recording
        System.out.println("The put() method returns:" + responseCache.put(ur1,uc));
    }
}