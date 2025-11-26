import java.io.*;

class OutputStreamDemo{
    public static void main(String args[])throws Exception{
        OutputStream os = new FileOutputStream("file.txt");
        byte b[] = {65, 66, 67, 68, 69, 70};

        os.write(b);
        os.flush();

        //write(byte [] b)
        for(int i=71; i<75; i++){
            os.write(i);
        }

        os.flush();

        //close the stream
        os.close();
    }
}