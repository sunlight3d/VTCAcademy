package app;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private String serverName = "localhost";
    private Integer port = 6868;
    private Socket socket;
    private PrintWriter printWriter;

    private String userName;
    private String zoomName;
    Client(String serverName, Integer port) {
        this.serverName = serverName;
        this.port = port;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("I am client");
        Client client = new Client("localhost", 6868);
        client.runChat();        
    }
    public void runChat() {
        try {
            socket = new Socket(serverName, port); 
            System.out.println("Connected to the chat server");
            Thread readThread = new Thread(new Runnable(){            
                @Override
                public void run() {    
                    try {
                        InputStream input = socket.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));
                        while(true) {
                            String response = bufferedReader.readLine();
                            System.out.println("\n" + response);                                                    
                        }
                        // bufferedReader.close();
                    }  catch (IOException ex) {
                        System.out.println("I/O Error: " + ex.getMessage());
                    }                                                         
                }
            });            
            Thread  writeThread = new Thread(new Runnable(){            
                @Override
                public void run() {      
                    try {
                        OutputStream output = socket.getOutputStream();
                        printWriter = new PrintWriter(output, true);
                        System.out.println("Enter userName : ");
                        userName = new Scanner(System.in).nextLine();
                        String inputString;
                        do {
                            System.out.print("["+userName+"] : ");
                            inputString = new Scanner(System.in).nextLine();
                            printWriter.println(inputString);
                 
                        } while (!inputString.equals("bye"));
                    }  catch (IOException ex) {
                        System.out.println("I/O Error: " + ex.getMessage());
                    }                     
                }
            });                        
            readThread.start();
            writeThread.start();            

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}