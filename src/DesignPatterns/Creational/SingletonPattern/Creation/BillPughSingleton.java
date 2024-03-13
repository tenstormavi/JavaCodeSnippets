package DesignPatterns.Creational.SingletonPattern.Creation;

public class BillPughSingleton {
    /**
     * The Bill Pugh or Holder Singleton pattern addresses both Eager loading and overhead due to synchronization,
     * with the help of a private static inner class. The class loader in a Java application loads the static inner
     * class SingletonHelper in the memory only once and only when it is referred, even if multiple threads call
     * getInstance().
    **/

    // In singleton, the constructor should be private so that object of the class cannot be created directly
    private BillPughSingleton() {}

    private static class SingletonHelper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.instance;
    }
}
