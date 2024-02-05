package org.example;

public class DatabaseSource {

    public String getMailByUsername(String username) {
        return username + "@gmail.com";
    }

    public String getFacebookByUsername(String username) {
        return username + "@facebook";
    }

    public String getWhatsAppByUsername(String username) {
        return username + "@whatsapp";
    }
}
