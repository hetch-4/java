import java.net.*;

public class InetAddressExample{
    public static void main(String [] args)throws Exception{
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("Local Host: "+local);
        System.out.println("Host Name: "+local.getHostName());

        InetAddress gfg = InetAddress.getByName("www.geeksforgeeks.org");
        System.out.println("GeeksforGeeks IP: "+gfg);
    }
}