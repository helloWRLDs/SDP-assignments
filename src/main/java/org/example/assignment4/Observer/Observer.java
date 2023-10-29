package org.example.assignment4.Observer;

import org.example.assignment4.Factory.Cloth;
import java.util.List;

public interface Observer {
    void eventHandle(List<Cloth> clothesList);
}
