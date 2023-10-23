package org.example.assignment1;

public class TaskComparator implements java.util.Comparator<Task>{

    @Override
    public int compare(Task a, Task b) {
        return a.getDate().compareTo(b.getDate());
    }
}
