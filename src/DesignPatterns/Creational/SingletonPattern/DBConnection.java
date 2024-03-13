package DesignPatterns.Creational.SingletonPattern;

public class DBConnection {

    // 4. Double Locking
    private static DBConnection connectionObj;

    private DBConnection() {}

    public static DBConnection getInstance() {
        if (connectionObj == null) {
            synchronized (DBConnection.class) {
                if (connectionObj == null) {
                    connectionObj = new DBConnection();
                }
            }
        }
        return connectionObj;
    }
}
