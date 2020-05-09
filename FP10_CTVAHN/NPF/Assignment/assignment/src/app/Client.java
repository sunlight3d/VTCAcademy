package app;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private String serverName = "localhost";
    private Integer port = 6868;
    private Socket socket;

    public static void main(String[] args) throws Exception {
        System.out.println("I am client");
        try {
            Client client = new Client("localhost", 6868);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your sms : ");
            String message = scanner.nextLine();
            client.send(message);
        } catch (Exception e) {
            System.err.println("Error connecting server. " + e.toString());
        }

    }

    public Client(String serverName, Integer port) throws Exception {
        try {
            this.socket = new Socket(this.serverName, this.port);
            this.serverName = serverName;
            this.port = port;
        } catch (Exception e) {
            System.err.println(e.toString());
            throw e;
        }

    }

    public void send(String message) {
        try {
            OutputStream outputStream = this.socket.getOutputStream();
            outputStream.write(message.getBytes());
            System.out.println("CLIENT send: " + message);
            outputStream.flush();

        } catch (Exception e) {
            System.err.println("FROM CLIENT: Cannot send sms. Error" + e.toString());
        }
    }

    public String receive() {
        try {
            InputStream is = socket.getInputStream();
            byte[] mess = is.readAllBytes();
            String message = new String(mess, 0, mess.length);
            System.out.println(message);
            System.out.println("CLIENT receive: " + message);
            return message;
        } catch (Exception e) {
            System.err.println("FROM CLIENT: Cannot receive sms. Error" + e.toString());
            return "";
        }

    }

}