package org.example.assignment1;

import java.util.*;

public class TaskManager {
    private static TaskManager instance;
    public List<Task> taskList = new ArrayList<>();

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void printTasks() {
        taskList.sort(new TaskComparator());
        System.out.println("\nCurrent Tasks:");
        for (Task task : taskList) {
            if (!(task.getStrategy() instanceof DoneTask)) {
                System.out.printf("[%s] %s: %s\n",task.getDate().toString(), task.getName(), task.getDescription());
            }
        }
        System.out.println();
    }

    public void performTask(int i) {
        Task task = taskList.get(i);
        task.getStrategy().execute(task);
        task.setStrategy(new DoneTask());
    }
}
