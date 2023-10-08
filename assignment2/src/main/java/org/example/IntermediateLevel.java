package org.example;

public class IntermediateLevel extends  LevelDecorator{
    public IntermediateLevel(Course course) {
        this.course = course;
    }

    @Override
    public String getDescription() {
        return course.description + ", intermediate level";
    }

    @Override
    public int getPrice() {
        return course.price + 50;
    }
}
