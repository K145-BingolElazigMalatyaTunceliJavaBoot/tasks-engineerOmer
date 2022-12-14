package Business.Manager;

import Business.AppleService;
import Entities.Apple;
import Rooms.AppleRoom;

public class AppleManager implements AppleService {
    private AppleRoom appleRoom;
    Apple apple;

    public AppleManager(Apple apple) {
        this.appleRoom = new AppleRoom();
        this.apple = apple;
    }

    @Override
    public Apple add(Apple apple) {
         this.apple.setUnitsInStock(apple.getUnitsInStock()+this.apple.getUnitsInStock());
         return this.apple;
    }

    @Override
    public void buy(double kilogram) {
        if (kilogram > apple.getUnitsInStock()) {
            System.out.println("Stoktaki elma limiti asildi");
        } else {
            apple.setUnitsInStock(apple.getUnitsInStock() - kilogram);
            System.out.println("Urun basariyla satin alindi");
            System.out.println("Stok adedi: " + apple.getUnitsInStock());

        }
    }
}
    /*
    @Override
    public void add(double kilo) {
       apple.setUnitsInStock(apple.getUnitsInStock()+kilo);
    }



    @Override
    public void buy(double kilogram) {
        if (kilogram>apple.getUnitsInStock()){
            System.out.println("Stoktaki elma limiti asildi");
        }
        else {
            apple.setUnitsInStock(apple.getUnitsInStock() - kilogram);
            System.out.println("Urun basariyla satin alindi");
            System.out.println("Stok adedi: " + apple.getUnitsInStock());

        }
    }*/



