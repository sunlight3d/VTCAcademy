package test;

import java.util.*;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailManagement {
    private final String to = "sunlight4d@gmail.com";// change accordingly
    // Sender's email ID needs to be mentioned
    private final String from = "pf10vtca@gmail.com";// change accordingly
    private final String username = "pf10vtca@gmail.com";// change accordingly
    private final String password = "vtca@1234";// change accordingly
    // Assuming you are sending email through relay.jangosmtp.net
    private final String host = "smtp.gmail.com";
    final Properties props = new Properties();

    public void setupMail() {     
        //properties = hashmap          
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");    
    }
    public void sendMail() {
        try {
            // Get the Session object.
            final Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
            // Create a default MimeMessage object.
            final Message message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            // Set Subject: header field
            message.setSubject("Testing Email Subject");
            // Now set the actual message
            message.setText("Hello, this is sample for to check send " + "email using JavaMailAPI");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (final MessagingException e) {
            throw new RuntimeException(e);
            } 
    }
    
}