package DesignPatterns.Creational.AbstractFactory;

public class Application {
    private final GUIFactory factory;
    private Button button;
    private TextBox textbox;
    public Application(GUIFactory guiFactory) {
        this.factory = guiFactory;
    }

    void createUI() {
        this.button = factory.createButton();
        this.textbox = factory.createTextBox();
    }

    void paint() {
        button.paint();
        textbox.paint();
    }
}
