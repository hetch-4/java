import java.io.*;
import java.net.*;

public class Client{
    //initialize socket i/o streams
    private Socket s = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    public Client(String addr, int port){
        //Establish a connection
        try{
            s = new Socket(addr,port);
            System.out.println("Connected");

            //takes input from terminal
            in = new DataInputStream(System.in);

            //send output to socket
            out = new DataOutputStream(s.getOutputStream());
        }catch(UnknownHostException u){
            System.out.print(u);
            return;
        
        }catch(IOException i){
            System.out.println(i);
            return;
        }

        //string to read meassage from input
        String m = "";

        //Keep reading until "over" is input
        while(!m.equals("Over")){
            try{
                m = in.readLine();
                out.writeUTF(m);
            }catch(IOException i){
                System.out.println(i);
            }
        }

        //Close the connection
        try{
            in.close();
            out.close();
            s.close();
        }catch(IOException i ){
            System.out.println(i);
        }
    }

    public static void main(String [] args){
        Client c = new Client("127.0.0.1", 5000);
    }
}