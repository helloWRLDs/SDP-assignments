package org.example;

public class Main {
    public static void main(String[] args) {
        Course course = new CppCourse();
        course = new AdvancedLevel(course);
        System.out.println(course.getDescription());
    }
}
