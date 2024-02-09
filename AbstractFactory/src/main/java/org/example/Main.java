package org.example;

public class Main {
    public static void main(String[] args) {
        Company msi = new MsiCompany();
        Gpu msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();


        Company asus = new AsusCompany();
        Gpu asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();

    }
}