package org.example;

public class Main {
    public static void main(String[] args) {

        Notifier notifyAll = new FacebookDecorator(new WhatsappDecorator(new NotifierImpl("Milvena")));
        notifyAll.send("10$ has been withdrawn from your bank account!");

        System.out.println("------------------------");

        Notifier notifyByMailAndWhatsapp = new WhatsappDecorator(new NotifierImpl("Aneliya"));
        notifyByMailAndWhatsapp.send("Successful transaction!");

        System.out.println("------------------------");

        Notifier notifyBiMail = new NotifierImpl("Ivan");
        notifyBiMail.send("100$ were successfully added to your bank account!");


    }
}