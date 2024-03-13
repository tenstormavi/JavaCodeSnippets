package DesignPatterns.Creational.SingletonPattern.Creation;

public class DBConnectionLazy {

    /**
     * 2. Lazy Initialization
     * It mean application will create instance when it is requested.
     * However, this can be used when you have non-thread-safe application. If used in multi threading it might break,
     * Why? because your getinstance method if invoked by two thread at same time then!!!!
     *
     * When to use?  Non thread safe and creating common resource like db connection.
     *
     *
     */
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
