package DesignPatterns.Creational.AbstractFactory;

public class Winbutton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}
