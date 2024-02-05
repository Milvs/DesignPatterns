package org.example;

/** Notes:
 * -> includes the core/default logic
 * -> the main notification channel - email*/
public class BaseNotifierDecorator implements Notifier {

    private final Notifier wrapper; // holds a reference to an instance of Notifier
    protected final DatabaseSource databaseSource;

    public BaseNotifierDecorator(Notifier wrapper) {
        this.wrapper = wrapper;
        this.databaseSource = new DatabaseSource();
    }

    @Override
    public void send(String msg) {
        wrapper.send(msg);
    }

    @Override
    public String getUsername() {
        return wrapper.getUsername();
    }


}
