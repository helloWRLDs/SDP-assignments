package org.example.assignment4.Factory;

public class Pants implements Cloth{
    private String name;

    public Pants(String name) {
        this.name = name;
    }

    public String getType() {
        String type = "pants";
        return type;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
