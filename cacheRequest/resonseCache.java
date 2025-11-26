import java.io.IOException;
import java.net.*;
import java.util.*;

public class JavaResponseCacheExample1{
    public static void main(String args[])throws Exception{

        String uri = "https://www.onlinegdb.com";
        URI uri1 = new URI(uri);

        URL url = new URL("http:www.onlinegdb.com");

        //constructor of urlconnection
        URLConnection urlcon = url.openConnection();
        ResponseCache responseCache = new ResponseCache(){
            //calling abstract methods
            @Override
            public CacheResponse get(
                URI uri, String rqstMethod,
                Map<String, List<String>> rqstHeaders
            )throws IOException{
                return null;
            }

            @Override
            public CacheRequest put(
                URI uri, URLConnection conn
            )throws IOException{
                return null;
            }
        };

        //the set of system-wide response cache
        ResponseCache.setDefault(responseCache);

        //the getDefault() returns system-wide responseCache.
        System.out.println("Default value: "+ResponseCache.getDefault());

        Map<String, List<String>> maps = new HashMap<String, List<String>>();
        List<String> list = new LinkedList<String>();
        list.add("REema");

        //put() sets all applicable cookies, 
        //present in response headers into a cookie cache
        maps.put("1", list);
        System.out.println("The put() method returns: "+ responseCache.put(uri1, urlcon));
        System.out.println("The get() method has been called...");
        System.out.println("The get() method returns: "+responseCache.get(uri1, uri, maps));
    }
}