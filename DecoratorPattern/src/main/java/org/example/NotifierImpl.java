package org.example;

public class NotifierImpl implements Notifier{
    private final String username;
    private final DatabaseSource databaseSource;

    public NotifierImpl(String username) {
        this.username = username;
        this.databaseSource = new DatabaseSource();
    }

    @Override
    public void send(String msg) {
        String mail = databaseSource.getMailByUsername(username);
        System.out.printf("%s - > send to %s MAIL \n",msg,mail);

    }

    @Override
    public String getUsername() {
        return username;
    }
}
