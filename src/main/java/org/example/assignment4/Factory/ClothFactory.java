package org.example.assignment4.Factory;

import javax.management.RuntimeErrorException;

public class ClothFactory {

    public static Cloth getClothes(String type, String name) {
        if (type.equalsIgnoreCase("shoes") || type.equalsIgnoreCase("foot")) {
            return new FootWear(name);
        } else if (type.equalsIgnoreCase("outer")) {
            return new OuterWear(name);
        } else if (type.equalsIgnoreCase("pants")) {
            return new Pants(name);
        } else if (type.equalsIgnoreCase("shirt")) {
            return new Shirt(name);
        } else {
            return null;
        }
    }
}
