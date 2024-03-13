package DesignPatterns.Creational.SingletonPattern.Creation;

public class Main {

    public static void main(String args[]) {
        // This will always return a single instance of DBConnection

        DBConnectionEager connectionEager = DBConnectionEager.getInstance();

        DBConnectionLazy connectionLazy = DBConnectionLazy.getInstance();

        DBConnectionSynchronized connectionSynchronized = DBConnectionSynchronized.getInstance();

        DBConnection connectionObj = DBConnection.getInstance();
    }
}
