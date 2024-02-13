package org.example;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<Listeners> customers;

    public NotificationService() {
        this.customers = new ArrayList<>();
    }

    public void subscribe(Listeners listeners) {
        this.customers.add(listeners);
    }

    public void unsubscribe(Listeners listeners) {
        this.customers.remove(listeners);
    }

    public void notifyListeners() {
        customers.forEach(Listeners::update);
    }
}
