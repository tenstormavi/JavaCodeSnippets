package DesignPatterns.Creational.AbstractFactory;

public class Main {

    public static void main(String args[]) {
        GUIFactory guiFactory = new WinFactory();
        Application application = new Application(guiFactory);
        application.createUI();
        application.paint();
    }
}
