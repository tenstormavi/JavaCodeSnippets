package DesignPatterns.Behavioral.ObserverPattern.Example1;

import DesignPatterns.Behavioral.ObserverPattern.Example1.Observer.NewsChannel;
import DesignPatterns.Behavioral.ObserverPattern.Example1.Observerable.NewsAgency;

public class Main {

    public static void main(String args[]) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("Test News");
        System.out.println(observer.getNews());
    }
}
