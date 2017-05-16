package Project;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


    public class Server {
        public static void main(String[] args) throws IOException {
            ServerSocket serversocket = null;
            try {
                serversocket = new ServerSocket(8080);
            } catch (IOException e) {
                System.out.println("can not connect");
            }
            Socket socket = null;
            try {
                socket = serversocket.accept();
            } catch (IOException e) {
                System.out.println("can not accept the connection");
            }

            InputStream in = null;
            OutputStream out = null;
            try {
                in = socket.getInputStream();
            } catch (IOException e) {
                System.out.println("can not get input stream , or socket error");
            }

            try {
                out = new FileOutputStream("test.txt");
            } catch (FileNotFoundException e) {
                System.out.println("file not found");
            }
            byte[] b = new byte[20 * 1024];
            int i;
            while ((i = in.read(b)) > 0) {
                out.write(b, 0, i);
            }
            out.close();
            in.close();
            socket.close();
            serversocket.close();
        }
    }




