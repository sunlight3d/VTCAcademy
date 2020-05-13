package app;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MonitorClient {
    private String serverName = "localhost";
    private Integer port = 6868;
    private Socket socket;

    MonitorClient(String serverName, Integer port) {
        this.serverName = serverName;
        this.port = port;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("I am MonitorClient");
        Client client = new Client("localhost", 6868);
        client.runChat();        
    }
    public void runChat() {
        try {
            socket = new Socket(serverName, port);             
            Thread readThread = new Thread(new Runnable(){            
                @Override
                public void run() {    
                    try {
                        InputStream input = socket.getInputStream();                        
                        while(true) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));                            
                            String response = bufferedReader.readLine();
                            System.out.println("\n" + response);                                                    
                        }
                        // bufferedReader.close();
                    }  catch (IOException ex) {
                        System.out.println("I/O Error: " + ex.getMessage());
                    }                                                         
                }
            });                        
            readThread.start();      

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}