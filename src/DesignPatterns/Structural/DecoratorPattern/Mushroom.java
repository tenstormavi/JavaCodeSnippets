package DesignPatterns.Structural.DecoratorPattern;

public class Mushroom extends ToppingDecorator {

    private BasePizza basePizza;

    public Mushroom(BasePizza pizza) {
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
