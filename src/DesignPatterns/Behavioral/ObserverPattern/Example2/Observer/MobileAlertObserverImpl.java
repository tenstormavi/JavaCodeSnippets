package DesignPatterns.Behavioral.ObserverPattern.Example2.Observer;

import DesignPatterns.Behavioral.ObserverPattern.Example2.Observerable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    private String userName;
    private StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is in stock now.");
    }

    private void sendMsgOnMobile(String userName, String message) {
        System.out.println("Message sent to: " + userName + " with message: " + message);
    }
}
