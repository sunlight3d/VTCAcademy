package app;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static String serverName = "localhost";
    public static Integer port = 6868;
    public static ServerSocket serverSocket;
    private Socket socket;//"client socket ??", se cho thanh array list, phai test 2 client

    public static void main(String[] args) throws Exception {
        System.out.println("App Chat");
        Server server = new Server();
        server.waitClientConnect();
    }

    public void waitClientConnect() {
        try {
            serverSocket = new ServerSocket(port);
            socket = serverSocket.accept();
            while (true) {                
                System.out.println("Connect roi nhe");
                this.receive();                
            }
            // socket.close();
            // serverSocket.close();
        } catch (IOException ioException) {
            System.err.println("waitClientConnect. Error: " + ioException.toString());
        }
    }

    public String receive() {
        try {
            InputStream is = socket.getInputStream();
            byte[] mess = is.readAllBytes();
            String message = new String(mess, 0, mess.length);
            System.out.println(message);
            System.out.println("SERVER receive: "+message);                   
            return message;
        } catch (Exception e) {
            System.err.println("FROM SERVER: Cannot receive sms. Error" + e.toString());
            return "";
        }

    }
    public void send(String message) {
        try {
            OutputStream outputStream = socket.getOutputStream();            
            outputStream.write(message.getBytes());   
            System.out.println("SERVER send: "+message);  
            outputStream.flush();

        } catch (Exception e) {
            System.err.println("FROM SERVER: Cannot send sms. Error" + e.toString());            
        }
    }
}