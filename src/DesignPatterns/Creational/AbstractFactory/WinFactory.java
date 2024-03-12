package DesignPatterns.Creational.AbstractFactory;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new Winbutton();
    }

    @Override
    public TextBox createTextBox() {
        return new WinTextBox() ;
    }
}
