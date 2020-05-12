package app;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static String serverName = "localhost";
    public static Integer port = 6868;
    public static ServerSocket serverSocket;
    private Socket socket;// "client socket ??", se cho thanh array list, phai test 2 client
    PrintWriter printWriter;
    
    public static void main(String[] args) throws Exception {
        System.out.println("App Chat");
        Server server = new Server();
        server.waitClientConnect();
    }

    public void waitClientConnect() {
        try {
            serverSocket = new ServerSocket(port);
            // while (true) {
            socket = serverSocket.accept();// socket server
            if (socket.isConnected() == true) {
                System.out.println("Connect to server successfully");
            }
            printWriter = new PrintWriter(socket.getOutputStream(),true);                        
            String message = this.receive();
            printWriter.println("SERVER receive: " + message);
        } catch (IOException ioException) {
            System.err.println("waitClientConnect. Error: " + ioException.toString());
        }
    }
    public String receive() {
        try {
            printWriter.println("Enter your mess: ");
            BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            return bufferedReader.readLine();
        }catch(Exception e) {   
            return "";
        }
    }
    public void send(String message) {
        try {
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(message.getBytes());
            System.out.println("SERVER send: " + message);
            outputStream.flush();
        } catch (Exception e) {
            System.err.println("FROM SERVER: Cannot send sms. Error" + e.toString());
        }
    }
}