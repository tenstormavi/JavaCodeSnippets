package DesignPatterns.Creational.PrototypePattern;

/**
 * Prototype pattern comes into creational design pattern. As the name suggest
 * As the name state prototype meaning creating object from some  reference which we already have.
 * It is mainly useful when we have Object which is already created with costly operations at that time we keep that
 * object after creation whenever we need new object we simply clone object and tweak or do slight modification in
 * the object and use it.
 *
 * In cloning its totally upto implementor whether we want to have shallow copy or deep copy while cloning.
 *
 * There are mainly three components involved in simple Prototype design pattern.
 * 1. Prototype : Type of class which has clone method and a super class of all prototypes.
 * 2. Sub-Classes - Which implements cloning.
 * 3. Client which uses this subclass and clone
 *
 * https://simpletechtalks.com/prototype-design-pattern/
 * http://www.jasondeoliveira.com/2011/05/tutorial-common-design-patterns-in-c-40_07.html
 * https://reactiveprogramming.io/blog/en/design-patterns/prototype
 */

public class Main {
    public static void main(String args[]) {
        Student student = new Student(25, 67, "Avi");
        Student cloneObj = (Student) student.clone();
    }
}
