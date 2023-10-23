package org.example.assignment2;

public abstract class Course implements ICourse{
    String description = "default course";
    int price = 0;

    public String getDescription() {
        return this.description;
    }
    public int getPrice() {
        return this.price;
    }
}
