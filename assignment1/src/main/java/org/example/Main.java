package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TaskManager taskManager = TaskManager.getInstance();
        taskManager.addTask(new Task("Wake up", "get good time cycle", LocalDate.of(2023, 10, 3), new ToDoTask()));
        taskManager.addTask(new Task("Get breakfast", "healthy  breakfast", LocalDate.of(2023, 10, 4), new ToDoTask()));
        taskManager.addTask(new Task("Go outside", "don't get late", LocalDate.of(2023, 10, 2), new ToDoTask()));

        taskManager.printTasks();

        TaskManager newTaskManager = TaskManager.getInstance();
        newTaskManager.addTask(new Task("Do homework", "lots of homework", LocalDate.of(2023, 10, 10), new ToDoTask()));

        taskManager.performTask(0);
        newTaskManager.printTasks();
    }
}
