package org.example;

public abstract class Course {
    String description = "default course";
    int price = 0;

    public String getDescription() {
        return this.description;
    }
    public int getPrice() {
        return this.price;
    }
}
