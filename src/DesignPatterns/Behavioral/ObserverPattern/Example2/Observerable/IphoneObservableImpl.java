package DesignPatterns.Behavioral.ObserverPattern.Example2.Observerable;

import DesignPatterns.Behavioral.ObserverPattern.Example2.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {
    private List<NotificationAlertObserver> observerList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStocksCount(int newStockAdded) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStocksCount() {
        return stockCount;
    }
}
