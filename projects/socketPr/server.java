import java.net.*;
import java.io.*;

public class Server{
    //initialize socket and input stream
    private Socket s = null;
    private ServerSocket ss = null;
    private DataInputStream in = null;

    //constructor with port
    public Server(int port){
        //Starts server and awaits for a connection
        try{
            ss = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client...");

            s = ss.accept();
            System.out.println("Client accepted");

            //Takes input from the client socket
            in = new DataInputStream( new BufferedInputStream(s.getInputStream()));
            String m = "";

            //Reads message from clien until "Over"
            while(!m.equals("Over")){
                try{
                    m = in.readUTF();
                    System.out.println(m);
                }catch(IOException i){
                    System.out.println(i);
                }
                System.out.println("Closing connection");

                //close connection
                s.close();
                in.close();
            }
        }catch(IOException i){
            System.out.println(i);
        }

    }

    public static void main(String [] args){
        Server s = new Server(5000);
    }
}