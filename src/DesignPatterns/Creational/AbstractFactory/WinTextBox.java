package DesignPatterns.Creational.AbstractFactory;

public class WinTextBox implements TextBox {
    @Override
    public void paint() {
        System.out.println("Windows TextBox");
    }
}
