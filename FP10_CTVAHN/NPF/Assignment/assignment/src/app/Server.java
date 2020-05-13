package app;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static String serverName = "localhost";
    public static Integer port = 6868;
    public static ServerSocket serverSocket;    
    private ArrayList<ServerThread> serverThreads = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        System.out.println("Server");
        Server server = new Server();
        server.waitClients();
    }    
    public void waitClients() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("waiting client connection on port : " + port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Connected to the chat server");
                ServerThread serverThread = new ServerThread(socket);
                serverThread.server = this;
                this.serverThreads.add(serverThread);
                // DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());                                
                serverThread.start();
            }
        } catch (Exception e) {
            System.out.println("Error in the server " + e.getMessage());
            e.printStackTrace();
        }                
    }   
    void broadcast(String message) {
        //send to all users
        for (ServerThread serverThread: serverThreads) {
            serverThread.sendMessage(message);
        }
    }
    public void removeThread(ServerThread serverThread) {
        serverThreads.removeIf(eachServerThread -> eachServerThread.getUserName().equals(serverThread.getUserName()));
    }
}