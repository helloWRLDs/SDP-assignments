package org.example.assignment4;

import org.example.assignment4.Factory.Cloth;
import org.example.assignment4.Factory.ClothFactory;
import org.example.assignment4.Observer.Observed;
import org.example.assignment4.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ClothesStore implements Observed {
    List<Cloth> clothList = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addCloth(String type, String name) {
        Cloth cLoth = ClothFactory.getClothes(type, name);
        if (cLoth != null) {
            clothList.add(cLoth);
            notifyObservers();
        }
    }

    public void removeCloth(String type) {
        for (int i = 0; i < clothList.size(); i++) {
            if (type.equalsIgnoreCase(clothList.get(i).getType())) {
                clothList.remove(i);
                notifyObservers();
                break;
            }
        }
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.eventHandle(clothList);
        }
    }
}
