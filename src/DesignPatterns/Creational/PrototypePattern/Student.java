package DesignPatterns.Creational.PrototypePattern;

public class Student implements Prototype {

    int age;
    private int rollNumber;
    String name;

    Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        // can access private class variables too
        return new Student(age, rollNumber, name);
    }
}
