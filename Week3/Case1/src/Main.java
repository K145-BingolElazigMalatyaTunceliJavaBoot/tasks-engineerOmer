import Business.AppleService;
import Business.CherryService;
import Business.Manager.AppleManager;
import Business.Manager.CherryManager;
import Business.Manager.PearManager;
import Business.PearService;
import Entities.Apple;
import Entities.Cherry;
import Entities.Pear;
import Rooms.AppleRoom;
import Rooms.CherryRoom;
import Rooms.PearRoom;



public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(30);
        AppleService appleService = new AppleManager(apple);
        appleService.buy(5);
        appleService.buy(5);
        appleService.add(new Apple(10));
        appleService.buy(15);
        System.out.println();
        //appleService.add(50);
        /*
        appleService.buy(5);
        appleService.buy(100);*/
        System.out.println(apple.getUnitsInStock());


        System.out.println("******************************************");
        Cherry cherry = new Cherry(40);
        CherryService cherryService = new CherryManager(new CherryRoom(),cherry);
        cherryService.buy(5);
        cherryService.add(10);
        cherryService.buy(3.5);
        cherryService.buy(42);
        System.out.println(cherry.getUnitsInStock());

/*
        Pear pear = new Pear(30);
        PearService pearService = new PearManager(new PearRoom(),pear);
        pearService.buy(35);
        pearService.add(25);
        pearService.buy(27.5);
        System.out.println(pear.getUnitsInStock());*/





    }
}
