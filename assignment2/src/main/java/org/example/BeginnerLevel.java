package org.example;

public class BeginnerLevel extends LevelDecorator{
    public BeginnerLevel(Course course) {
        this.course = course;
    }

    @Override
    public String getDescription() {
        return course.getDescription() + ", beginner's level";
    }

    @Override
    public int getPrice() {
        return course.getPrice() + 20;
    }
}
