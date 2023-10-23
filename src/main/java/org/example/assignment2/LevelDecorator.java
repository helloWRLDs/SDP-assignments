package org.example.assignment2;

public abstract class LevelDecorator extends Course {
    Course course;
    public abstract String getDescription();
    public abstract int getPrice();
}
