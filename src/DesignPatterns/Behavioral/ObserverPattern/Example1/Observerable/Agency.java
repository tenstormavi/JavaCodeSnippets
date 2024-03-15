package DesignPatterns.Behavioral.ObserverPattern.Example1.Observerable;

import DesignPatterns.Behavioral.ObserverPattern.Example1.Observer.Channel;

public interface Agency {
    public void addObserver(Channel channel);

    public void removeObserver(Channel channel);

    public void setNews(String news);
}
