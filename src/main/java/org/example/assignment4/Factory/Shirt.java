package org.example.assignment4.Factory;

public class Shirt implements Cloth{
    private String name;

    public Shirt(String name) {
        this.name = name;
    }

    public String getType() {
        String type = "shirt";
        return type;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
