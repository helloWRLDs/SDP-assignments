package org.example.assignment4.Observer;

import org.example.assignment4.Factory.Cloth;
import org.example.assignment4.ListOutput;

import java.util.List;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void eventHandle(List<Cloth> clothesList) {
        System.out.printf("Hello, %s. our stock have been updated:", this.name);
        ListOutput.outputList(clothesList);
        System.out.println("==============================================================\n\n");
    }
}
