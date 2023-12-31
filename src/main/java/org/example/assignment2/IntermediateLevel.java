package org.example.assignment2;

public class IntermediateLevel extends LevelDecorator{
    public IntermediateLevel(Course course) {
        this.course = course;
    }

    @Override
    public String getDescription() {
        return course.getDescription() + ", intermediate level";
    }

    @Override
    public int getPrice() {
        return course.getPrice() + 50;
    }
}
