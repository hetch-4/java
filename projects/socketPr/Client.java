import java.io.*;
import java.net.*;

public class Client{

    public static void main(String [] args){
        String address = "127.0.0.1";
        int port = 5000;

        if(args.length>1){
            try{
                port = Integer.parseInt(args[1]);
            }catch(NumberFormatException e){
                System.err.println("Invalid port number. Using default 5000.");
            }
        }

        new Client(address, port);
    }

    public Client(String addr, int port){
        try(
            //establish connection
            Socket socket = new Socket(addr, port);

            //set up stream to read from the console
            BufferedReader consoleIn = new BuffegiredReader(new InputStreamReader(System.in, "UTF-8"));

            //set upt strem to send messages to the server through the socket
            DataOutputStream out = new DataOutputStream(socket.getOutputStream())
        ){
            System.out.println("Connected to "+addr+":"+port);
            System.out.println("Type 'Over' to exit");

            String message;

            while(true){
                message = consoleIn.readLine();

                if(message == null || message.equalsIgnoreCase("Over")){
                    System.out.println("Closing connection...");
                    break;
                }

                //send message to server
                out.writeUTF(message);
            }
        
        }catch(UnknownHostException u){
            System.out.println("Error: Unknown host "+addr);
        }catch(IOException i){
            System.out.println("Connection/IO Error: "+i.getMessage());
        }
    }
}