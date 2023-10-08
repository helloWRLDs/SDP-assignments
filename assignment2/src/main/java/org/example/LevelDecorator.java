package org.example;

public abstract class LevelDecorator extends Course {
    Course course;
    public abstract String getDescription();
    public abstract int getPrice();
}
