package DesignPatterns.Behavioral.ObserverPattern.Example2.Observerable;

import DesignPatterns.Behavioral.ObserverPattern.Example2.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void addObserver(NotificationAlertObserver observer);

    public void removeObserver(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStocksCount(int newStockAdded);

    public int getStocksCount();
}
