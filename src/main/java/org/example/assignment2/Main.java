package org.example.assignment2;

public class Main {
    public static void main(String[] args) {
        Course course = new CppCourse();
        course = new AdvancedLevel(course);
        course = new IntermediateLevel(course);
        System.out.println(course.getDescription());
        System.out.println(course.getPrice());

        Course course2 = new DeutschCourse();
        course2 = new BeginnerLevel(course2);
        System.out.println(course2.getDescription());
        System.out.println(course2.getPrice());
    }
}
