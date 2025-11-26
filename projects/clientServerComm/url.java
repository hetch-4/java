import java.net.*;

public class URLExample{
    public static void main(String [] args)throws Exception{
        URL url = new URL("https://write.geeksforgeeks.org/post/3038131");

        System.out.println("Host : "+url.getHost());
        System.out.println("File : "+ url.getFile());
        System.out.println("Path : "+ url.getPath());
        System.out.println("Dafault Port : "+ url.getDefaultPort());
    }
}