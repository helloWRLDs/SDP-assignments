package org.example.assignment1;

public class ToDoTask implements TaskStrategy{
    @Override
    public void execute(Task task) {
        System.out.printf("Executing %s...\n", task.getName());
        System.out.println("Task is done");
    }
}
