import java.io.*;
import java.net.*;

public class MyClient{
    public static void main(String [] args){
        try{
            Socket soc = new Socket("localhost",6666);

            DataOutputStream d = new DataOutputStream(soc.getOutputStream());
            d.writeUTF("Hello GFG Readers!");
            d.flush();
            d.close();
            soc.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}