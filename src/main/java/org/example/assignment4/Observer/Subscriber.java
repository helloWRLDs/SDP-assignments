package org.example.assignment4.Observer;

import org.example.assignment4.Factory.Cloth;
import org.example.assignment4.ClothListOutput;

import java.util.List;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void eventHandle(List<Cloth> clothesList) {
        System.out.printf("Hello, %s. Our stock have been updated:", this.name);
        ClothListOutput.outputList(clothesList);
        System.out.println("==============================================================\n\n");
    }
}
