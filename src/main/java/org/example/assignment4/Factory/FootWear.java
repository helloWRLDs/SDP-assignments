package org.example.assignment4.Factory;

public class FootWear implements Cloth {
    private String type = "footwear";
    private String name;

    public FootWear(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
