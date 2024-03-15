package DesignPatterns.Behavioral.ObserverPattern.Example2.Observer;

import DesignPatterns.Behavioral.ObserverPattern.Example2.Observerable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    private String emailId;
    private StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product is in Stock now.");
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("Mail sent to: " + emailId + " with message: " + message);
    }
}
