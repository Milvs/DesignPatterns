package org.example;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public void newItemPromotion(){
        notificationService.notifyListeners();
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
