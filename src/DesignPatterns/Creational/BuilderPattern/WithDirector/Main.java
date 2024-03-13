package DesignPatterns.Creational.BuilderPattern.WithDirector;

/*
 * Builder pattern is also used when single class has different object representation meaning let's say We are
 * creating Burger which can be Veg, non veg ... which can have extra cheese or less cheese, bread size medium, large.
 * As user, you will say only I need one extra cheese large veg burger.
 *
 * To do so you can also have different builders which eventually passes the argument which are required to create
 * that object.
 *
 * Reference : https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 * https://springframework.guru/gang-of-four-design-patterns/builder-pattern/
 *
 */

public class Main {
    public static void main(String args[]) {
        // GOF Builder example
        Meal meal = new MealDirector(new NonVegMealBuilder()).prepareMeal();
    }
}
