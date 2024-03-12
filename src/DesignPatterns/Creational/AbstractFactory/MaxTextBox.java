package DesignPatterns.Creational.AbstractFactory;

public class MaxTextBox implements TextBox {
    @Override
    public void paint() {
        System.out.println("Mac TextBox");
    }
}
