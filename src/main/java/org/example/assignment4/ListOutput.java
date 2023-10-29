package org.example.assignment4;

import org.example.assignment4.Factory.Cloth;

import java.util.List;

public class ListOutput {
    public static void outputList(List<Cloth> clothList) {
        for (Cloth cloth : clothList) {
            System.out.printf("%s ", cloth.getName());
        }
        System.out.println();
    }
}
