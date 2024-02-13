package org.example;

public class SmsListener implements Listeners{
    private final String phoneNumber;

    public SmsListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        System.out.println("Sending sms for phone number: " +this.phoneNumber );
    }
}
