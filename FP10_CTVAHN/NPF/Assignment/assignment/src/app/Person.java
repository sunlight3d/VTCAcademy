package app;

import java.io.Serializable;

public class Person implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String email;
    private String encryptedPasword;
    Person(String email, String encryptedPasword) {
        this.email = email;
        this.encryptedPasword = encryptedPasword;
    }
}