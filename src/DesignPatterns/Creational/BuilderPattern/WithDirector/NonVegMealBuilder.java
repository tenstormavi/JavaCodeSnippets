package DesignPatterns.Creational.BuilderPattern.WithDirector;

public class NonVegMealBuilder extends MealBuilder {
    private Meal meal;

    public NonVegMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void addBiryani() {
        this.meal.setBriyani("Chicken");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Roti");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("CocaCola");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Non-veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
