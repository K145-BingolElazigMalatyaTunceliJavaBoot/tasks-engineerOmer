package Rooms;

import Entities.Apple;


import java.util.ArrayList;
import java.util.List;

public class AppleRoom {
    List<Apple> listApple = new ArrayList<>();

    public Apple add(Apple apple){
        this.listApple.add(apple);
        return apple;
    }

}
