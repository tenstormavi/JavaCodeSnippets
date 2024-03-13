package DesignPatterns.Creational.SingletonPattern.Break;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String args[]) throws IOException, ClassNotFoundException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
//        exampleSerialization();
        exampleReflection();
    }

    private static void exampleSerialization() throws IOException, ClassNotFoundException {
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();

        // Serialized
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(serializableSingleton);
        objectOutputStream.close();

        // De-serialized
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        SerializableSingleton deserializedObj = (SerializableSingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Object 1 :" + serializableSingleton.hashCode());
        System.out.println("Object 2 :" + deserializedObj.hashCode());
    }

    private static void exampleReflection() throws InstantiationException,
            IllegalAccessException, InvocationTargetException {
        Constructor[] constructors = DBConnection.class.getDeclaredConstructors();
        // Knowing only one constructor taking it using index
        Constructor constructor = constructors[0];
        // Changing the constructor accessibility
        constructor.setAccessible(true);

        DBConnection singletonInstance = (DBConnection) constructor.newInstance();
        DBConnection instance = DBConnection.getInstance();

        System.out.println("Reflected hashcode singleton :" + singletonInstance.hashCode());
        System.out.println("Singleton instance : " + instance.hashCode());

        // Solution to this is go by enum
        EnumSingleton.INSTANCE.doSomething();
    }
}
