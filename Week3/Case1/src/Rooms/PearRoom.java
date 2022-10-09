package Rooms;


import Entities.Pear;

import java.util.ArrayList;
import java.util.List;

public class PearRoom {
    List<Pear> listPear = new ArrayList<>();

    public Pear add(Pear pear){
        this.listPear.add(pear);
        return pear;
    }

}
