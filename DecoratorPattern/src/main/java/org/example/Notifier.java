package org.example;
/** Notes:
 * -> defines the common interface for all concrete components (objects) that can be decorated.**/
public interface Notifier {

    void send(String msg);
    String getUsername();
}
