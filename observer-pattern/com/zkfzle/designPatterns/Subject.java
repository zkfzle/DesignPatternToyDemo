package com.zkfzle.designPatterns;

/**
 * Created by zkfzle on 2017/5/1.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}



