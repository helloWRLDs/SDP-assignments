package org.example.assignment4.Factory;

public class OuterWear implements Cloth{
    private String name;

    public OuterWear(String name) {
        this.name = name;
    }

    public String getType() {
        String type = "outer";
        return type;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
