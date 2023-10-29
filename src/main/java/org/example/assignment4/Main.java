package org.example.assignment4;

import org.example.assignment4.Observer.Subscriber;

public class Main {
    public static void main(String[] args) {
        ClothesStore clothesStore = new ClothesStore();
        clothesStore.addObserver(new Subscriber("Alex"));
        clothesStore.addObserver(new Subscriber("Vova"));

        clothesStore.addCloth("outer", "some outerwear");
        clothesStore.addCloth("shoes", "some shoes");

        clothesStore.removeCloth("footwear");
    }
}
