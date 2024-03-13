package DesignPatterns.Creational.BuilderPattern.WithDirector;

public class VegMealBuilder extends MealBuilder {
    private Meal meal;

    public VegMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void addBiryani() {
        this.meal.setBriyani("Veg");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Naan");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Sprite");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
