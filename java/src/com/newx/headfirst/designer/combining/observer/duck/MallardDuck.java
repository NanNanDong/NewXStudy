package com.newx.headfirst.designer.combining.observer.duck;

import com.newx.headfirst.designer.combining.observer.Observable;
import com.newx.headfirst.designer.combining.observer.Observer;
import com.newx.headfirst.designer.combining.observer.Quackable;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 * 整合 Quackable 和 QuackObservable
 */
public class MallardDuck implements Quackable {

    private Observable mObservable;

    public MallardDuck() {
        mObservable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        mObservable.notifyObservers();
    }

    @Override
    public void quack() {
        System.out.println("呱呱");
        notifyObservers();
    }

    @Override
    public String toString() {
        return "野鸭";
    }
}
