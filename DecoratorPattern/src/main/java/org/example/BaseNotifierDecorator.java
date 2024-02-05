package org.example;

public class BaseNotifierDecorator implements Notifier {

    private final Notifier wrapper;
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
