package org.example;

import java.time.LocalDate;

public class Task {
    private String name;
    private String description;
    private LocalDate date;
    private TaskStrategy strategy;

    public Task(String name, String description, LocalDate date, TaskStrategy strategy) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.strategy = strategy;
    }

    public TaskStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(TaskStrategy strategy) {
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
