package Project;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;


public class Clinet
{
    public static void main(String [] args)throws UnknownHostException,IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        File file = new File("C:/Users/ASUS");
        long lenght = file.length();
        byte[] b = new byte[20 * 1024];
        InputStream in = new FileInputStream(file);
        OutputStream out =socket.getOutputStream();
        int i;
        while((i=in.read(b))>0)
        {
            out.write(b,0,i);
        }
        out.close();
        in.close();
        socket.close();
    }
}


