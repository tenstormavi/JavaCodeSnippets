package DesignPatterns.Behavioral.ObserverPattern.Example2;

import DesignPatterns.Behavioral.ObserverPattern.Example2.Observer.EmailAlertObserverImpl;
import DesignPatterns.Behavioral.ObserverPattern.Example2.Observer.MobileAlertObserverImpl;
import DesignPatterns.Behavioral.ObserverPattern.Example2.Observer.NotificationAlertObserver;
import DesignPatterns.Behavioral.ObserverPattern.Example2.Observerable.IphoneObservableImpl;
import DesignPatterns.Behavioral.ObserverPattern.Example2.Observerable.StocksObservable;

public class Store {

    public static void main(String args[]) {

        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1
                = new EmailAlertObserverImpl("xyz@test.com", iphoneStocksObservable);
        NotificationAlertObserver observer2
                = new EmailAlertObserverImpl("abc@test.com", iphoneStocksObservable);
        NotificationAlertObserver observer3
                = new MobileAlertObserverImpl("xyz_abc_username", iphoneStocksObservable);

        iphoneStocksObservable.addObserver(observer1);
        iphoneStocksObservable.addObserver(observer2);
        iphoneStocksObservable.addObserver(observer3);

        iphoneStocksObservable.setStocksCount(10);
    }
}
