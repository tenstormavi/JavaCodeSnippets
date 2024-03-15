package DesignPatterns.Structural.DecoratorPattern;

public class Main {

    public static void main(String args[]) {
        BasePizza pizza = new Mushroom(new FarmHouse());
        System.out.println(pizza.cost());
    }
}
