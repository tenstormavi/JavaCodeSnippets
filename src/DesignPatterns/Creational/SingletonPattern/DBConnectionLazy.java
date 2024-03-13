package DesignPatterns.Creational.SingletonPattern;

public class DBConnectionLazy {

    // 2. Lazy Initialization
    // Whenever there is a requirement, then only create the object og DBConnection
    // Problem - Multi thread can create 2 instances
    private static DBConnectionLazy connectionObj;

    // In singleton, the constructor should be private so that object of the class cannot be created directly
    private DBConnectionLazy() {}

    public static DBConnectionLazy getInstance() {
        if (connectionObj == null) {
            connectionObj = new DBConnectionLazy();
        }
        return connectionObj;
    }
}
