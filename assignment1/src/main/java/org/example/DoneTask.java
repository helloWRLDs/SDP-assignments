package org.example;

public class DoneTask implements TaskStrategy{

    @Override
    public void execute(Task task) {
        System.out.println("Task is done already");
    }
}
