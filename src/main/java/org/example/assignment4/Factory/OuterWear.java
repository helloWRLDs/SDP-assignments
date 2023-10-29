package org.example.assignment4.Factory;

public class OuterWear implements Cloth{
    private String type = "outerwear";
    private String name;

    public OuterWear(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
