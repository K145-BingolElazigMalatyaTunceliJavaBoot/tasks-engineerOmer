package Rooms;


import Entities.Cherry;

import java.util.ArrayList;
import java.util.List;

public class CherryRoom {
    List<Cherry> listCherry = new ArrayList<>();

    public Cherry add(Cherry cherry){
        this.listCherry.add(cherry);
        return cherry;
    }

}
