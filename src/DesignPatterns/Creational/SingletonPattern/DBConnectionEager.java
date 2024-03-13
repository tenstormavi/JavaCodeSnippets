package DesignPatterns.Creational.SingletonPattern;

public class DBConnectionEager {

    // 1. Eager Initialization
    // Problem - even though no one is using it the object will be available in memory
    private static DBConnectionEager connectionObj = new DBConnectionEager();

    // In singleton, the constructor should be private so that object of the class cannot be created directly
    private DBConnectionEager() {}

    public static DBConnectionEager getInstance() {
        return connectionObj;
    }

}
