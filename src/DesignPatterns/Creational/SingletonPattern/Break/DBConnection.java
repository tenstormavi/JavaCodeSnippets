package DesignPatterns.Creational.SingletonPattern.Break;

public class DBConnection {

    /**
     * 4. Double Locking
     *
     * As mentioned in Lazy Initialization if our get instance method invoked by two thread at the
     * same time then there are chances that two objects created, and we violate singleton pattern.
     * To avoid we have two choices :
     *
     * 1. Create getinstance synchronized so that only one instance can invoke that method. However, disadvantage is
     * lets say there are 3 thread t1 is inside getinstance and t2,t3 waiting. Now t2 will get into method and simply
     * return instance created by t1 and t3 still waiting. So it had lead to unnecessary of locks.
     *
     * 2. To avoid we have synchronized block which we will implement here.
     */
    private static DBConnection connectionObj;

    private DBConnection() {}

    public static DBConnection getInstance() {
        // Question arise why we have two null check here.
        // Reason for first null check is same as explained in method level synchronization why create lock if our
        // object is already created.
        if (connectionObj == null) {
            // Our method is static, so we have class level locking here
            synchronized (DBConnection.class) {
                // Reason for second null check is lets say two object are come inside first null at same time
                // One call has taken lock and proceeds for creating object first time. Now once lock is released for t1
                // t2 should not create object because its already created and that's why we have second null check.
                if (connectionObj == null) {
                    connectionObj = new DBConnection();
                }
            }
        }
        return connectionObj;
    }
}