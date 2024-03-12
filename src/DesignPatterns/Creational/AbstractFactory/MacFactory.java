package DesignPatterns.Creational.AbstractFactory;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaxTextBox();
    }
}
