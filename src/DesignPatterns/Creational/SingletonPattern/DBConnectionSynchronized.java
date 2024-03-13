package DesignPatterns.Creational.SingletonPattern;

public class DBConnectionSynchronized {

    // 3. Synchronized Method
    // Only one thread will be able to work at a time because of lock
    // Problem is it is very expensive, because of everytime lock
    private static DBConnectionSynchronized connectionObj;

    // In singleton, the constructor should be private so that object of the class cannot be created directly
    private DBConnectionSynchronized() {}

    synchronized public static DBConnectionSynchronized getInstance() {
        if (connectionObj == null) {
            connectionObj = new DBConnectionSynchronized();
        }
        return connectionObj;
    }
}
