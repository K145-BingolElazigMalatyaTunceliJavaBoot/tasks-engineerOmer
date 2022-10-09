package Business.Manager;

import Business.PearService;
import Entities.Pear;
import Rooms.PearRoom;

public class PearManager implements PearService {

    private PearRoom pearRoom;

    Pear pear;

    public PearManager(PearRoom pearRoom, Pear pear) {
        this.pearRoom = pearRoom;
        this.pear = pear;
    }

    @Override
    public void add(double kilo) {
        pear.setUnitsInStock(pear.getUnitsInStock()+kilo);
    }

    @Override
    public void buy(double kilogram) {
        if (kilogram>pear.getUnitsInStock()){
            System.out.println("Stoktaki elma limiti asildi");
        }
        else {
            pear.setUnitsInStock(pear.getUnitsInStock() - kilogram);
            System.out.println("Urun basariyla satin alindi");
            System.out.println("Stok adedi: " + pear.getUnitsInStock());

        }
    }
}
