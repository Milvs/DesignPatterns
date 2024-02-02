package org.example;

public class Connection {
    private static Connection connection = new Connection();

    //make the constructor private so that this class cannot be instantiated
    private Connection() {}

    public static Connection getInstance(){
        return connection;
    }

    public void showMessage(){
        System.out.println("Connection established!");

    }
}
