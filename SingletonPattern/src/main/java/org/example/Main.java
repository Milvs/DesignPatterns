package org.example;

public class Main {
    public static void main(String[] args) {

        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();

        System.out.println("Object1: " + connection1.hashCode() + "\nObject2: " + connection2.hashCode());
    }
}