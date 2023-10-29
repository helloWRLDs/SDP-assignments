package org.example.assignment4;

import org.example.assignment4.Factory.Cloth;
import java.util.List;

public class ClothListOutput {
    public static void outputList(List<Cloth> clothList) {
        System.out.print("\n[ ");
        for (Cloth cloth : clothList) {
            System.out.print(cloth.getName());
            if (clothList.indexOf(cloth) != clothList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
        System.out.println();
    }
}
