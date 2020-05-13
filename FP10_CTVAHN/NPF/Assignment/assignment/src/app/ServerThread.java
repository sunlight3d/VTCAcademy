package app;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread {
    private Socket socket;
    private String userName;
    private PrintWriter printWriter;

    public Server server;
    ServerThread(Socket socket) {
        this.socket = socket;
    }
    public String getUserName() {
        return userName;
    }
    @Override
    public void run() {        
        try {
            
            OutputStream outputStream = socket.getOutputStream();
            printWriter = new PrintWriter(outputStream, true);
            
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            this.userName = bufferedReader.readLine();            
            
            server.broadcast("New user connected: " + userName);
 
            String clientMessage; 
            do {              
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                clientMessage = bufferedReader.readLine();  
                server.broadcast(userName + "says : " + clientMessage);
 
            } while (!clientMessage.equals("bye"));
 
            server.removeThread(this);
            socket.close();
            server.broadcast(userName + " has signed out.");
            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error in ServerThread: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    public void sendMessage(String message) {
        printWriter.println(message);
    }
}