package org.example;

public class AdvancedLevel extends LevelDecorator{
    public AdvancedLevel(Course course) {
        this.course = course;
    }

    @Override
    public String getDescription() {
        return course.getDescription() + ", advanced level";
    }

    @Override
    public int getPrice() {
        return price + 100;
    }
}
