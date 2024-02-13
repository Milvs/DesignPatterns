package org.example;

public class EmailListener implements Listeners{

    private final String email;

    public EmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Sending email to: " + this.email);
    }
}
