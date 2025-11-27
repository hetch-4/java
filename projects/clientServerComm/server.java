import java.io.*;
import java.net.*;

public class ServerSide{
    public static void main(String [] args){
        try(
            ServerSocket server = new ServerSocket(5000);
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream())
        ){
            System.out.println("Server started. \nwaiting for client...");
            String line;

            do{
                System.out.println("Client: "+line);
            }while((line=in.readUTF()).equals("End")){
                System.out.println("Closing connection");
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}