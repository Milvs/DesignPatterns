package org.example;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        NotificationService notificationService = store.getNotificationService();
        Listeners emailListener = new EmailListener("milvena@gmail.com");
        Listeners emailListener2 = new EmailListener("ana@gmail.com");
        Listeners smsListener1 = new SmsListener("0258746");

        notificationService.subscribe(emailListener);
        notificationService.subscribe(emailListener2);
        notificationService.subscribe(smsListener1);

        store.newItemPromotion();

        System.out.println("-------Unsubscribing-----------");
        notificationService.unsubscribe(emailListener2);

        store.newItemPromotion();

    }
}
