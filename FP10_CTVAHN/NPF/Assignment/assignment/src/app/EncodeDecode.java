package app;

import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

public class EncodeDecode {
    public static String encode(String content) {
        return Base64.getEncoder().encodeToString(content.getBytes()) + "haha";
    }
    public static String decode(String content) {
        content = content.replaceAll("haha", "");
        byte[] decodedBytes = Base64.getDecoder().decode(content);
        String decodedString = new String(decodedBytes);
        return decodedString;
    }
    public static String getMd5(String input) 
    { 
        try { 
  
            // Static getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
  
            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        }  
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
    public static boolean checkPassword(String encryptedPassword, String rawPassword) {
        return getMd5(rawPassword).equals(encryptedPassword);        
    }
    
}